package 코테22년12월.코테2022_12_19;

/*문제
정수를 요소로 갖는 배열을 입력받아 오름차순으로 정렬하여 리턴해야 합니다.
버블 정렬(bubble sort)은 여러 정렬 알고리즘(삽입 정렬, 퀵 정렬, 병합 정렬, 기수 정렬 등) 중 가장 기본적인 알고리즘입니다.

버블 정렬 알고리즘은 아래와 같습니다.

첫 번째 요소가 두 번째 요소보다 크면, 두 요소의 위치를 바꿉니다. (swap)
두 번째 요소와 세 번째 요소보다 크면, 두 요소의 위치를 바꿉니다. (swap)
1, 2를 마지막까지 반복합니다. (마지막에서 두 번째 요소와 마지막 요소를 비교)
1~3의 과정을 한 번 거치게 되면, 가장 큰 요소가 배열의 마지막으로 밀려납니다.
1~3의 과정을 첫 요소부터 다시 반복합니다.
5를 통해 두 번째로 큰 요소가 배열의 마지막 바로 두 번째로 밀려납니다.
1~3의 과정을 총 n번(배열의 크기) 반복합니다.
이 모습이 마치 '거품이 밀려 올라가는 것과 같은 모습'과 같아서 bubble sort라고 부릅니다.

입력
인자 1 : arr
int 타입을 요소로 갖는 배열
arr[i]는 정수
arr[i]의 길이는 1,000 이하
출력
int 타입을 요소로 갖는 배열을 리턴해야 합니다.
배열의 요소는 오름차순으로 정렬되어야 합니다.
arr[i] <= arr[j] (i < j)
주의사항
위에서 설명한 알고리즘을 구현해야 합니다.
arr.sort 사용은 금지됩니다.
입력으로 주어진 배열은 중첩되지 않은 1차원 배열입니다.*/

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{2, 1, 3});
        System.out.println(Arrays.toString(output));
    }
    public static int[] bubbleSort(int[] arr) {
        // TODO:
        /*for(int i = 0; i < arr.length - 1; i++) {
            for(int j= 1 ; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr; 코플릿 테스트 실패 출력값은 맞음*/
        for(int i = 0; i < arr.length; i++) {
            int num = 0;
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    num++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(num == 0) {
                break;
            }
        }
        return arr;
    }
}
