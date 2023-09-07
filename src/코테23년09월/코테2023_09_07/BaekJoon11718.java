package 코테23년09월.코테2023_09_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11718 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }1번째 방법*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                break;
            }
            sb.append(str).append("\n");
        }
        br.close();
        System.out.println(sb); // 2번째 방법
    }
}
