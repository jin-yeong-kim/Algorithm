package 코테2022_11_17;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output));
    }
    public static int[] reverseArr(int[] arr){
        // TODO:
        // 1. 마지막 요소를 선택(head)
        // 2. 마지막 요소를 제외한 요소를 가진 배열(tail)
        // 3. tail 배열을 전달인자로, 재귀함수를 실행
        // 4. 마지막 요소가 담긴 배열 head와 재귀함수의 반환값이 담긴 배열 tail의 요소를 합침
        // 5. head와 tail을 합치기 위해 새로운 배열인 desk를 만들어 길이를 head와 tail의 길이를 합친 길이로 생성
        // 6. desk에 head와 tail을 System.arraycopy()로 복사해서 넣어준 다음 desk를 리턴

        if(arr.length == 0) return new int[]{};
        int[] head = new int[]{arr[arr.length - 1]};
        int[] tail = reverseArr(Arrays.copyOfRange(arr,0,arr.length-1));
        int[] desk = new int[head.length + tail.length];
        System.arraycopy(head,0,desk,0,head.length);
        System.arraycopy(tail,0,desk,head.length,tail.length);

        return desk;
    }
}
