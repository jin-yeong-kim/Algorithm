package 코테23년09월.코테2023_09_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder finalResult = new StringBuilder();
        String result = "*";
        String space = "";
        for (int i = 0; i < num - 1; i++) {
            space += " ";
        }
        finalResult.append(space + result + "\n");
        for (int i = 1; i <= num - 1; i++) {
            result += "**";
            finalResult.append(space.substring(i) + result + "\n");
        }
        for (int i = 1,j = 2; i <= num - 1; i++) {
            result = result.substring(0, result.length() - j);
            finalResult.append(space.substring(space.length() - i) + result + "\n");
        }
        System.out.println(finalResult);
    }
}
