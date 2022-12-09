package 코테22년11월.코테2022_11_15;

import java.util.Arrays;

public class IsHot {
    public static void main(String[] args) {
        int[] temperature = {25, 29, 30, 31, 26, 30, 33};
        boolean output = isHot(temperature);
        System.out.println(output); // true
    }
    public static boolean isHot(int[] temperature) {
        //TODO..
        if(temperature.length > 7) return false;
        return Arrays.stream(temperature).filter(n -> n >= 30).count() >= 3 ? true : false;
    }
}
