package 코테23년10월.코테2023_10_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (map.containsKey(name)) {
                if (st.nextToken().equals("enter")) {
                    map.replace(name, 1);
                } else {
                    map.replace(name, 0);
                }
            } else if (st.nextToken().equals("enter")) {
                map.put(name, 1);
            } else {
                map.put(name, 0);
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> person : map.entrySet()) {
            if (person.getValue() == 1) {
                result.add(person.getKey());
            }
        }
        result.sort(Collections.reverseOrder());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
