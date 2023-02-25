package 코테23년02월.코테2023_02_25;

/*문제
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

출력
첫째 줄에 N!을 출력한다.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Factorial {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            int sum = factorial(N);
            System.out.println(sum);

        }

        public static int factorial(int N) {
            if(N <= 1) return 1;	// 재귀 종료조건
            return N * factorial(N - 1);
        }
}
