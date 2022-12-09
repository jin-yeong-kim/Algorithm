package 코테22년12월.코테2022_12_01;

import java.util.Arrays;

public class RemoveExtremes {
    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(Arrays.toString(output));
    }
    public static String[] removeExtremes(String[] arr) {
        // TODO:
        if(arr.length == 0) return null;
        int min = arr[0].length();
        int max = arr[0].length();
        int minIdx = 0;
        int maxIdx = 0;

        String[] result = new String[arr.length - 2];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() <= min) {
                min = arr[i].length();
                minIdx = i;
            }
            if(arr[i].length() >= max) {
                max = arr[i].length();
                maxIdx = i;
            }
        }

        int copyIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == minIdx || i == maxIdx) {
                continue;
            }
            result[copyIndex++] = arr[i];
        }

        return result;
    }
}
