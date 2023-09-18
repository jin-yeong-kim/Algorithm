package 코테23년09월.코테2023_09_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            sb.append(c / quarter + " ");
            c %= quarter;
            sb.append(c / dime + " ");
            c %= dime;
            sb.append(c / nickel + " ");
            c %= nickel;
            sb.append(c / penny + "\n");
        }
        System.out.println(sb);
    }
}
