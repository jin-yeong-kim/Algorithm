package 코테23년07월.코테2023_07_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EscapeFromRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        arr[2] = String.valueOf(Long.parseLong(arr[2]) - Long.parseLong(arr[0]));
        arr[3] = String.valueOf(Long.parseLong(arr[3]) - Long.parseLong(arr[1]));
        Long min = Long.parseLong(arr[0]);
        for (String s : arr) {
            if (min > Long.parseLong(s)) min = Long.parseLong(s);
        }
        System.out.println(min);
    }
}