package 코테23년11월.코테2023_11_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

/*효율이 좋은 HashMap과 StringBuilder를 사용*/

public class Baekjoon1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Boolean> list = new HashMap<>();
        ArrayList<String> subList = new ArrayList<>(); // 사전순 정렬을 위해 리스트에 넣은 뒤에 StringBuilder에 넣어줌
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < N; i++) {
            list.put(br.readLine(), false);
        }
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (list.get(name) != null) {
                subList.add(name);
                count++;
            }
        }
        Collections.sort(subList);
        sb.append(count).append("\n");
        for (int i = 0; i < subList.size(); i++) {
            sb.append(subList.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
