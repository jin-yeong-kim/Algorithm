package 코테23년09월.코테2023_09_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] result = br.readLine().split("");
        System.out.println(result[Integer.parseInt(br.readLine()) - 1]);
    }
}
