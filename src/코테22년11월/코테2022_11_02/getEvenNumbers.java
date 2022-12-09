package 코테22년11월.코테2022_11_02;
import java.util.*;
public class getEvenNumbers {
    public int[] getEvenNumbers(int[] arr) {
        // TODO:
        int[] result = new int[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                result = Arrays.copyOf(result, result.length + 1); // result의 배열 안의 값을 복사하면서 새로운 배열의 result의 길이를 1늘린 새로운 주소의 배열을 만듦
                // { 2, 4, 0 }
                result[result.length - 1] = arr[i];
                // { 2, 4, 8 }
            }
        }

        return result;
    }
}
