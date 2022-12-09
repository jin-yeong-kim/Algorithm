package 코테22년11월.코테2022_11_14;

/*문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();  // N은 쓸모가 없으므로 입력만 받는다.

        int sum = 0;

        for(byte value : br.readLine().getBytes()) {
            sum += (value - '0'); // 또는 (a-48)
        }

        System.out.println(sum);
    }
}
