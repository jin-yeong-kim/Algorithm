package 코테22년10월.코테2022_10_26;

/*      문제
        총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

        출력
        첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다. */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Counting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int m = Integer.parseInt(st.nextToken());
            map.put(m, map.getOrDefault(m, 0) + 1);
        }
        int v = Integer.parseInt(br.readLine());
        if (map.containsKey(v)) {
            System.out.print(map.get(v));
        } else {
            System.out.print(0);
        }
    }
}
