package 코테22년11월.코테2022_11_17;

import java.util.Arrays;

public class Take {
    public static void main(String[] args) {
        int[] output = take(2, new int[]{1, -2, 1, 3});
        System.out.println(output); // --> [1, -2]

        output = take(5, new int[]{1, -2, 1, 3});
        System.out.println(output);
    }
    static int count = 0;
    public static int[] take(int num, int[] arr){
        // TODO:
        //1. 첫번째 요소를 선택
        //2. 첫번째 요소를 제외한 요소를 가진 배열(tail)
        //3. 한가지 요소가 선택되었기 때문에 num -1 , tail 배열을 전달인자로, 재귀함수를 실행
        //4. 첫번째 요소가 담긴 배열 head와 재귀함수의 반환값이 담긴 배열 tail의 요소를 합친 배열을 반환
        if(num >= arr.length) return arr;
        if(num == 0 || arr.length == 0) return new int[]{};
        if(count == num) return arr;
        int[] head = new int[]{arr[0]};
        int[] tail = take(num -1, Arrays.copyOfRange(arr,1,arr.length));
        count++;
        int[] desk = new int[head.length + tail.length];
        System.arraycopy(head,0,desk,0,head.length);
        System.arraycopy(tail,0,desk,head.length,tail.length);
        return desk;
    }
}
