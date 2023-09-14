package 코테23년09월.코테2023_09_14;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        List<Character> result = new ArrayList<>();
        while (N > 0) {
            if (N % B < 10) {
                result.add((char) (N % B + '0'));
            } else {
                result.add((char) (N % B - 10 + 'A'));
            }
            N /= B;
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i));
        }
    }
}
