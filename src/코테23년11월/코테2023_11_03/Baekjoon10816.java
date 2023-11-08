package 코테23년11월.코테2023_11_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 효율이 좋은 HashMap과 StringBuilder를 사용하여 시간초과에 걸리지 않고 문제를 해결함

public class Baekjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> Possession = new HashMap<>(N);
        StringTokenizer st =  new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int Card = Integer.parseInt(st.nextToken());
            if (Possession.containsKey(Card)) {
                Possession.put(Card, Possession.get(Card) + 1);
            } else {
                Possession.put(Card, 1);
            }
        }
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
            int Num = Integer.parseInt(st.nextToken());
            sb.append(Possession.getOrDefault(Num, 0) + " ");
        }
        System.out.println(sb);
    }
}
