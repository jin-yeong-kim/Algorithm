package 코테2022_11_03;
import java.util.*;
public class getAllElementsButFirst {
    public int[] getAllElementsButFirst(int[] arr) {
        // TODO:
        if(arr.length == 0){
            return new int[]{};
        }
        int[] result = new int[arr.length-1];
        System.arraycopy(arr,1,result,0,arr.length-1);
        return result;
    }
}
