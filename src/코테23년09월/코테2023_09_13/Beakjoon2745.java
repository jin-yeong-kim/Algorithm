package 코테23년09월.코테2023_09_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int result = 0;
        for (int i = 0; i < N.length(); i++) {
            if ('0' <= N.charAt(i) && N.charAt(i) <= '9') {
                result = result * B + ((int)N.charAt(i) - (int)'0');
            } else {
                result = result * B + ((int)N.charAt(i) - (int)'A' + 10);
            }
        }
        System.out.println(result);
    }
}
