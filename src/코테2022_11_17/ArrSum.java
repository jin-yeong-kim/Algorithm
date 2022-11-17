package 코테2022_11_17;

import java.util.Arrays;

public class ArrSum {
    public static void main(String[] args) {
        int output = arrSum(new int[]{-1, -2, 1, 3});
        System.out.println(output);
    }
    public static int arrSum(int[] arr){
        //TODO..
        if(arr.length == 0) return 0;
        int[] result = Arrays.copyOfRange(arr,1,arr.length);
        return arr[0] + arrSum(result);
    }
}
