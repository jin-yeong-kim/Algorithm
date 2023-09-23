package 코테23년09월.코테2023_09_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String[] finalResult = new String[]{};
        int i = 0;
        while ((num = Integer.parseInt(br.readLine())) != -1) {
            int[] result = new int[]{};
            int sum = 0;
            for (int j = 1; j < num; j++) {
                if (num % j == 0) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = j;
                    sum += j;
                }
            }
            if (sum == num) {
                finalResult = Arrays.copyOf(finalResult, finalResult.length + 1);
                finalResult[i] = num + " =";
                for (int j = 0; j < result.length; j++) {
                    if (j == 0) {
                        finalResult[i] += " " + result[j];
                    } else {
                        finalResult[i] += " + " + result[j];
                    }
                }
                System.out.println(finalResult[i]);
            } else {
                finalResult = Arrays.copyOf(finalResult, finalResult.length + 1);
                finalResult[i] = num + " is NOT perfect.";
                System.out.println(finalResult[i]);
            }
            i++;
        }
    }
}
