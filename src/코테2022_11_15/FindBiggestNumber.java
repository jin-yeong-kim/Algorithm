package 코테2022_11_15;

import java.util.Arrays;

public class FindBiggestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 32, 5};
        Integer output = findBiggestNumber(arr);
        System.out.println(output); // 32
    }
    public static Integer findBiggestNumber(int[] arr) {
        //TODO..
        // 스트림 생성
        // 최대값 리턴
        if (arr.length == 0) {
            return null;
        }
        return Arrays.stream(arr)
                .max() // 배열의 요소 중 최댓값을 구합니다.
                .getAsInt();
    }
}
