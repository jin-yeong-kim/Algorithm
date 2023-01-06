package 코테23년01월.코테2023_01_06;

/*문제
정수를 요소로 갖는 배열을 입력받아 오름차순으로 정렬하여 리턴해야 합니다.

입력
인자 1 : arr
int 타입을 요소로 갖는 배열
arr[i]는 정수
arr.length는 1,000 이하

출력
int 타입을 요소로 갖는 배열을 리턴해야 합니다.
배열의 요소는 오름차순으로 정렬되어야 합니다.
arr[i] <= arr[j] (i < j)

주의사항
삽입 정렬을 구현해야 합니다.
Arrays.sort() 사용은 금지됩니다.
입력으로 주어진 배열은 중첩되지 않은 1차원 배열입니다.*/

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] output = insertionSort(new int[]{3, 1, 21});
        System.out.println(Arrays.toString(output));
    }
    public static int[] insertionSort(int[] arr) {
        return Sort(arr, 1);
    }
    public static int[] Sort(int[] arr,int target) {
        if (target == arr.length) {return arr;}
        for (int i = target; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        return Sort(arr, target + 1);
    }
}
