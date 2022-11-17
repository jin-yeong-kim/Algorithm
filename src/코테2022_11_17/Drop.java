package 코테2022_11_17;

import java.util.Arrays;

public class Drop {
    public static void main(String[] args) {
        int[] output = drop(2, new int[]{1, -2, 1, 3});
        System.out.println(output);

        output = drop(5, new int[]{1, -2, 1, 3});
        System.out.println(output);
    }
    public static int[] drop(int num, int[] arr){
        // TODO:
        if(num == 0 || arr.length == 0) return arr;
        return drop(num - 1, Arrays.copyOfRange(arr,1,arr.length));
    }
}
