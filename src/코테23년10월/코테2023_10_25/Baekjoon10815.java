package 코테23년10월.코테2023_10_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        long[] sub = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        br.readLine();
        long[] main = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int[] result = new int[main.length];
        for (int i = 0; i < sub.length; i++) {
            long n = sub[i];
            for (int j = 0; j < main.length; j++) {
                if (n == main[j]) {
                    result[j] = 1;
                }
            }
        }
        String output = "";
        for (int j = 0; j < result.length; j++) {
            if (j != result.length - 1) {
                output += result[j] + " ";
            } else {
                output += result[j];
            }
        }
        System.out.println(output);
    }
}
