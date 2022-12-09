package 코테22년11월.코테2022_11_03;
import java.util.*;
public class getAllElementsButLast {
    public int[] getAllElementsButLast(int[] arr) {
        // TODO:
        if(arr.length == 0){
            return new int[]{};
        }
        int[] result = new int[arr.length-1];
        result = Arrays.copyOfRange(arr, 0,arr.length-1);
        return result;
    }
}
