package 코테23년10월.코테2023_10_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] input = new int[3][2];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }
        int X = 0;
        int Y = 0;
        int[] result = new int[2];
        for (int i = 0; i < 3; i++) {
            X = input[i][0];
            Y = input[i][1];
            int XCount = 0;
            int YCount = 0;
            for (int j = 0; j < 3; j++) {
                if (X != input[j][0]) {
                    XCount++;
                }
                if (Y != input[j][1]) {
                    YCount++;
                }
            }
            if (XCount == 2) {
                result[0] = X;
            }
            if (YCount == 2) {
                result[1] = Y;
            }
        }
        System.out.println(result[0] + " " + result[1]);
    }
}
