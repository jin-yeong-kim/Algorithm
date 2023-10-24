package 코테23년10월.코테2023_10_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        long e = Long.parseLong(st.nextToken());
        long f = Long.parseLong(st.nextToken());

        long x = 0;
        long y = 0;
        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if (a * i + b * j == c && d * i + e * j == f) {
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(x + " " + y);
    }
}

/* 간단하게 푸는 방법 대신 출력은 맞게 나오지만 백준에서 정답으로 인식 되진 않음
public class Baekjoon19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        long e = Long.parseLong(st.nextToken());
        long f = Long.parseLong(st.nextToken());

        long x = (c - (b * f - e * c)) / (a * e - b * d);
        long y = (c - a * x) / b;
        System.out.println(x + " " + y);
    }
}*/
