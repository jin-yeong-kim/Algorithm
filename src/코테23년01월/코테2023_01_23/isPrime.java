package 코테23년01월.코테2023_01_23;

/*
소수 구하기
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	256 MB	220167	62411	43934	26.576%
문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 에라토스테네스의 체 필수 문제
public class isPrime {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        prime = new boolean[max + 1];
        get_Prime();
        for (int i = min; i <= max; i++) {
            if (!prime[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static boolean get_Prime() {
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
        return true;
    }
}
