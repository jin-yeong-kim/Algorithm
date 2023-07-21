package 코테23년07월.코테2023_07_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleJeongmin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split(" ");
        long output = 0;
        for (String Str : array) {
            output += Long.parseLong(Str);
        }
        System.out.print(output);
    }
}
