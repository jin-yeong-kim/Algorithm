package 코테22년12월.코테2022_12_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        String question = br.readLine();
        String[] croatia = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String ct = "";
        question : for(int i = 0; i < question.length(); i++) {
            for (String s : croatia) {
                if (i + 1 < question.length()) {
                    ct = String.valueOf(question.charAt(i));
                    ct += String.valueOf(question.charAt(i + 1));
                }
                if (ct.equals(s)) {
                    result++;
                    i++;
                    continue question;
                }
                if (i + 2 < question.length()) {
                    ct += String.valueOf(question.charAt(i + 2));
                }
                if (ct.equals(s)) {
                    result++;
                    i += 2;
                    continue question;
                }
            }
            result++;
        }
        System.out.println(result);
    }
}
