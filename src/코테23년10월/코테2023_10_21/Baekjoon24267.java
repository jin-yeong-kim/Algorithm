package 코테23년10월.코테2023_10_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()) - 2;
        System.out.println((n * n * n) + (3 * n * n) + (2 * n) / 6);
        System.out.println(3);
    }
}
