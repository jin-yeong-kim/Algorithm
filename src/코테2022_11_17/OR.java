package 코테2022_11_17;

import java.util.Arrays;

public class OR {
    public static void main(String[] args) {
        boolean output = or(new boolean[]{true, true, false});
        System.out.println(output); // --> true

        output = or(new boolean[]{false, false, false});
        System.out.println(output);
    }
    public static boolean or(boolean[] arr){
        // TODO:
        if(arr.length == 0) return false;
        if(arr[0] == true) return true;
        return or(Arrays.copyOfRange(arr,1,arr.length));
    }
}
