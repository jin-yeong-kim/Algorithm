package 코테23년09월.코테2023_09_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        String[] strArr = new String[5];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = br.readLine();
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < strArr.length; j++) {
                String ch = "";
                if (i < strArr[j].length()) {
                    ch = Character.toString(strArr[j].charAt(i));
                }
                if (ch != null) {
                    result += ch;
                }
            }
        }
        System.out.println(result);
    }
}
