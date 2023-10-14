package 코테23년10월.코테2023_10_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int EQCount = 0;
        int Equal = 0;
        int Total = 0;
        int[] Input = new int[3];
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            Input[i] = num;
            Total += num;
            if (num == 60) {
                EQCount++;
            }
        }
        if (Input[0] == Input[1]) {
            Equal++;
        }
        if (Input[1] == Input[2]) {
            Equal++;
        }
        if (Input[0] == Input[2]) {
            Equal++;
        }
        if (EQCount == 3) {
            System.out.println("Equilateral");
        } else if (Total == 180 && Equal == 1) {
            System.out.println("Isosceles");
        } else if (Total == 180 && Equal == 0) {
            System.out.println("Scalene");
        } else if (Total != 180) {
            System.out.println("Error");
        }
    }
}
