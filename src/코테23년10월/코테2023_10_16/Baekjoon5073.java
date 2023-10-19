package 코테23년10월.코테2023_10_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] input = new long[3];
            input[0] = Long.parseLong(st.nextToken());
            input[1] = Long.parseLong(st.nextToken());
            input[2] = Long.parseLong(st.nextToken());
            Arrays.sort(input);
            if (input[0] == 0 & input[1] == 0 & input[2] == 0) {
                break;
            } else if (input[2] >= input[0] + input[1]){
                System.out.println("Invalid");
            } else if (input[0] == input[1] && input[1] == input[2]) {
                System.out.println("Equilateral");
            } else if (input[0] == input[1] || input[1] == input[2] || input[0] == input[2]) {
                System.out.println("Isosceles");
            } else if (input[2] < input[0] + input[1]) {
                System.out.println("Scalene");
            }
        }
    }
}
