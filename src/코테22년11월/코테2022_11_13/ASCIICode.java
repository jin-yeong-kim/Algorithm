package 코테22년11월.코테2022_11_13;

/*문제
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class ASCIICode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ch = in.next().charAt(0);

        System.out.print(ch);
    }
}
