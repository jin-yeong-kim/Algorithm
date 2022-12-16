package 코테22년12월.코테2022_12_16;

/*문제
정수를 요소로 갖는 배열을 입력받아 3개의 요소를 곱해 나올 수 있는 최대값을 리턴해야 합니다.

입력
인자 1 : arr
int 타입을 요소로 갖는 임의의 배열

출력
int 타입을 리턴해야 합니다.

주의사항
입력으로 주어진 배열은 중첩되지 않은 1차원 배열입니다.
배열의 요소는 음수와 0을 포함하는 정수입니다.
배열의 길이는 3 이상입니다.*/

import java.util.Arrays;

public class LargestProductOfThree {
    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output);
    }
    public static int largestProductOfThree(int[] arr) {
        // TODO:
        Arrays.sort(arr);
        int num1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        int num2 = arr[arr.length - 1] * arr[0] * arr[1];
        return Math.max(num1,num2);
    }
}
