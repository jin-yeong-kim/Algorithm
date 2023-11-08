package 코테23년11월.코테2023_11_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 가장 효율이 좋은 HashMap 을 사용하면 시간 초과를 면할 수 있다.

public class Baekjoon1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> Pokedex = new HashMap<>(M);
        String[] SPokedex = new String[N];
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            Pokedex.put(name, i);
            SPokedex[i - 1] = name;
        }
        for (int j = 0; j < M; j++) {
            String compare = br.readLine();
            if (compare.chars().allMatch(Character::isDigit)) {
                System.out.println(SPokedex[Integer.parseInt(compare) - 1]);
            } else {
                System.out.println(Pokedex.get(compare));
            }
        }
    }
}
