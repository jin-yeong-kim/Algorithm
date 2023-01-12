package 코테23년01월.코테2023_01_12;

/*문제
정수를 요소로 갖는 배열을 입력받아 오름차순으로 정렬하여 리턴해야 합니다.

입력
인자 1 : arr
int 타입을 요소로 갖는 배열
arr[i]는 -1,000 이상 1,000 이하의 정수
arr.length는 1,000 이하

출력
int 타입을 요소로 갖는 배열을 리턴해야 합니다.

주의사항
힙 정렬을 구현해야 합니다.
Arrays.sort 사용은 금지됩니다.
입력으로 주어진 배열은 중첩되지 않은 1차원 배열입니다.
최소 힙(min heap)을 구현해야 합니다.
Java에서는 쉽게 heap을 사용할 수 있습니다.
PriorityQueue<Integer> heap = new PriorityQueue<Integer>()와 같은 방식으로 사용할 수 있습니다.

입출력 예시
int[] output = heapSort(new int[]{5, 4, 3, 2, 1});
System.out.println(output); // --> [1, 2, 3, 4, 5]

output = heapSort(new int[]{3, 1, 21});
System.out.println(output); // --> [1, 3, 21]

output = heapSort(new int[]{4, 10, 3, 5, 1});
System.out.println(output); // --> [1, 3, 4, 5, 10]*/

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        int[] output = heapSort(new int[]{5, 4, 3, 2, 1});
        System.out.println(Arrays.toString(output));
    }
    public static int[] heapSort(int[] arr) {
        // TODO:
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(List.of(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        for (int i = 0; i < arr.length; i++) {
                arr[i] = heap.poll();
        }
        return arr;
        /*PriorityQueue<Integer> heap = new PriorityQueue<Integer>(); 레퍼런스 (이상하게 위에 코드는 코플릿에선 작동하지 않음..)

		// 배열의 값을 힙에 모두 할당합니다.
		for(int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}

		// 힙에서 우선순위가 가장 높은 원소(root노드)를 하나씩 배열에 넣어줍니다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = heap.poll();
		}

		return arr;*/
    }
}
