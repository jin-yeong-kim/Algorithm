package 코테23년01월.코테2023_01_12;

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
