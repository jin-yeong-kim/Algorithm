package 코테23년09월.코테2023_09_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstDot = 2;
        int result = 0;
        int input = Integer.parseInt(br.readLine());
        for (int i = 0; i < input; i++) {
            firstDot += firstDot - 1;
            result = firstDot * firstDot;
        }
        System.out.println(result);
    }
}
