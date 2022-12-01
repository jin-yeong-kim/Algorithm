package 코테2022_12_02;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArr {
    public static void main(String[] args) {
        
    }
    public int[] reverseArr(int[] arr){
        // TODO:

        // 방법 1 ( 컬렉션 스트림을 이용한 내림차순 정렬 )
        // Integer[] ar = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        // Arrays.sort(ar, Collections.reverseOrder());
        // arr = Arrays.stream(ar).mapToInt(Integer::intValue).toArray();
        // return arr;

        // 방법 2 ( 재귀 호출 )
        if(arr.length == 0) return new int[]{};
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        int[] result = new int[head.length + tail.length];
        System.arraycopy(head, 0, result, 0, head.length);
        System.arraycopy(tail, 0, result, head.length, tail.length);
        return result;
    }
}
