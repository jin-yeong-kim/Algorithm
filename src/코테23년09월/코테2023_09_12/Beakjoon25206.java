package 코테23년09월.코테2023_09_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Beakjoon25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;
        double subTotal = 0;
        String[][] subject = {{"A+", "4.5"}, {"A0", "4.0"}, {"B+", "3.5"},
                {"B0", "3.0"}, {"C+", "2.5"}, {"C0", "2.0"}, {"D+", "1.5"},
                {"D0", "1.0"}, {"F", "0.0"}};
        for (int i = 0; i < 20; i++) {
            String[] strArray = br.readLine().split(" ");
            if (!Objects.equals(strArray[2], "P")) {
                subTotal += Double.parseDouble(strArray[1]);
                for (int j = 0; j < subject.length; j++) {
                    if (Objects.equals(strArray[2], subject[j][0])) {
                        total += Double.parseDouble(strArray[1]) * Double.parseDouble(subject[j][1]);
                    }
                }
            }
        }
        System.out.println(total / subTotal);
    }
}
