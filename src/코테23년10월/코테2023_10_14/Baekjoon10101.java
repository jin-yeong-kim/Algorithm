package 코테23년10월.코테2023_10_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine()),
                C = Integer.parseInt(br.readLine());
        if (A + B + C != 180) {
            System.out.println("Error");
        } else if (A == 60 && B == 60 && C == 60) {
            System.out.println("Equilateral");
        } else if (A == B || B == C || A == C) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
