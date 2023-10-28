package 코테23년10월.코테2023_10_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < A; i++) {
            map.put(br.readLine(), 0);
        }
        int count = 0;
        for (int j = 0; j < B; j++) {
            if (map.containsKey(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
