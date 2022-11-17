package 코테2022_11_17;

import java.util.Arrays;

public class AND {
    public static void main(String[] args) {
        boolean output = and(new boolean[]{true, true, true});
        System.out.println(output);

        output = and(new boolean[]{true, true, false});
        System.out.println(output);
    }
    public static boolean and(boolean[] arr){
        // TODO:
        if(arr.length == 0) return true;
        boolean[] head = new boolean[]{arr[0]};
        if(head[0] == false) return false;
        return and(Arrays.copyOfRange(arr,1,arr.length));
    }
}
