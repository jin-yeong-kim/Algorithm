package 코테23년10월.코테2023_10_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon14215 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[3];
        input[0] = Integer.parseInt(st.nextToken());
        input[1] = Integer.parseInt(st.nextToken());
        input[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(input);
        if (input[0] + input[1] <= input[2]) {
            input[2] = (input[0] + input[1]) - 1;
        }
        System.out.println(input[0] + input[1] + input[2]);
    }
}
