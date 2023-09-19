package 코테23년09월.코테2023_09_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int divisor = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());
        int[] result = new int[]{};
        for (int i = 1; i <= divisor; i++) {
            if (divisor % i == 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = i;
                if (result.length == index) {
                    System.out.println(result[index - 1]);
                }
            }
        }
        if (result.length < index) {
            System.out.println(0);
        }
    }
}
