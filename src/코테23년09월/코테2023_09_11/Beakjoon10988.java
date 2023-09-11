package 코테23년09월.코테2023_09_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();
        for (int i = ch.length - 1, j = 0; i >= 0; i--, j++) {
            if(ch[i] != ch[j]) {
                System.out.println(0);
                break;
            } else if (i == 0) {
                System.out.println(1);
            }
        }
    }
}
