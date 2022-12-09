package 코테22년10월.코테2022_10_24;
/*      문제
        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        입력
        입력은 여러 개의 테스트 케이스로 이루어져 있다.

        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

        출력
        각 테스트 케이스마다 A+B를 출력한다.  */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class APlusBMinus4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while( (str=br.readLine()) != null ){

            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;
            sb.append(a + b).append("\n");

        }
        System.out.print(sb);
    }
}
