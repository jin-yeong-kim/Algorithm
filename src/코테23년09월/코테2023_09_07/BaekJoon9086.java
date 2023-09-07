package 코테23년09월.코테2023_09_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] result = new String[N];
        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("");
            result[i] = arr[0];
            result[i] += (arr.length < 2) ? arr[0] : arr[arr.length - 1];
        }
        for (int i = 0; i < result.length; i++) {
            if ((i == result.length - 1)) {
                System.out.print(result[i]);
            } else {
                System.out.println(result[i]);
            }
        }
    }
}
