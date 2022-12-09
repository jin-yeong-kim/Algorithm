package 코테22년11월.코테2022_11_08;

/*문제
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class AboveAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;

        int testcase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < testcase ; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];

            double sum = 0; //성적 누적 합 변수

            //성적 입력부분
            for(int j = 0; j < N; j++) {
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val; //성적 누적 합
            }

            double mean = (sum / N);
            double count = 0; // 평균 넘는 학생 수 변수

            // 평균 넘는 학생 비율 찾기
            for(int j = 0; j < N; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count / N) * 100);
        }
    }
}
