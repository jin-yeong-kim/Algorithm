package 코테23년10월.코테2023_10_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n], y = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println((x[n - 1] - x[0]) * (y[n - 1] - y[0]));
        /*1. BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), max1 = 0, min1 = Integer.MAX_VALUE,
                max2 = 0, min2 = Integer.MAX_VALUE;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            max1 = Math.max(max1, a);
            min1 = Math.min(min1, a);
            max2 = Math.max(max2, b);
            min2 = Math.min(min2, b);
        }
        System.out.println((max1 - min1) * (max2 - min2));*/
        /*2. BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        if (num == 1) {
            System.out.println(0);
        }
        long[] low = new long[2];
        long[] high = new long[2];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            long zero = Long.parseLong(st.nextToken());
            long one = Long.parseLong(st.nextToken());
            if (i == 0) {
                low = new long[]{zero, one};
                high = new long[]{zero, one};
            }
            if (low[0] > zero) {
                low[0] = zero;
            } else if (high[0] < zero) {
                high[0] = zero;
            }

            if (low[1] > one) {
                low[1] = one;
            } else if (high[1] < one) {
                high[1] = one;
            }
        }
        System.out.println((high[0] - low[0]) * (high[1] - low[1])); 출력은 맞게 되지만 백준에서는 자꾸 틀렸다고 나옴*/
    }
}
