package 코테23년01월.코테2023_01_17;

/*문제
길이가 m, n이고 오름차순으로 정렬되어 있는 자연수 배열들을 입력받아 전체 요소 중 k번째 요소를 리턴해야 합니다.

입력

인자 1 : arr1
int타입을 요소로 갖는 배열
arr1.length는 m

인자 2 : arr2
int타입을 요소로 갖는 배열
arr2.length는 n

인자 3 : k
int 타입의 0 이상의 정수

출력
int 타입을 리턴해야 합니다.

주의사항
두 배열의 길이의 합은 1,000,000 이하입니다.
어떤 배열 arr의 k번째 요소는 arr[k-1]을 의미합니다.

입출력 예시
int[] arr1 = new int[]{1, 4, 8, 10};
int[] arr2 = new int[]{2, 3, 5, 9};
int result = getItemFromTwoSortedArrays(arr1, arr2, 6);
System.out.println(result); // --> 8

arr1 = new int[]{1, 1, 2, 10};
arr2 = new int[]{3, 3};
result = getItemFromTwoSortedArrays(arr1, arr2, 4);
System.out.println(result); // --> 3

Advanced
단순히 처음부터 끝까지 찾아보는 방법(O(K)) 대신 다른 방법(O(logK))을 탐구해 보세요.

힌트
이진 탐색(binary search)을 응용하여 해결합니다.*/

import java.util.Arrays;

public class GetItemFromTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 2, 10};
        int[] arr2 = new int[]{3, 3};
        int result = getItemFromTwoSortedArrays(arr1, arr2, 4);
        System.out.println(result);
    }
    public static int getItemFromTwoSortedArrays(int[] arr1, int[] arr2, int k) {
        // 필드 변수를 사용하면 테스트가 정상적으로 작동하지 않습니다.
        // 메서드 내부에서 값을 저장하고 활용해주세요.
        // TODO:
        // O(1) 시간 복잡도
        int[] arr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[k-1];

        // O(logK) 시간 복잡도 이진 탐색
        /*
        int leftIdx = 0;
		int rightIdx = 0;
		while (k > 0) {
			// 이진 탐색을 위해 각 배열에서 k를 절반으로 쪼개서 카운트 한다.
			int cnt = (int)Math.ceil(((double) k) / 2);
			int leftStep = cnt;
			int rightStep = cnt;

			// 엣지 케이스
			// 카운트가 남았음에도 배열의 끝에 도달하면 k를 나머지 배열쪽으로 넘긴다.
			if (leftIdx == arr1.length) {
				rightIdx = rightIdx + k;
				break;
			}

			if (rightIdx == arr2.length) {
				leftIdx = leftIdx + k;
				break;
			}

			// 엣지 케이스
			// 현재 카운트가 남아있는 후보 요소들보다 많을 경우, leftStep(현재 할당량)을 남아있는 요소들의 개수로 바꾼다.
			if (cnt > arr1.length - leftIdx) leftStep = arr1.length - leftIdx;
			if (cnt > arr2.length - rightIdx) rightStep = arr2.length - rightIdx;

			// 두 배열의 현재 검사 요소 위치를 비교해서, 그 값이 작은 배열은 비교한 위치 앞에 있는 요소들을 모두 후보군에서 제외시킨다.
			if (arr1[leftIdx + leftStep - 1] < arr2[rightIdx + rightStep - 1]) {
				leftIdx = leftIdx + leftStep;
				// 처리가 끝나면 k값을 절반으로 떨어뜨린다.
				k = k - leftStep;
			} else {
				rightIdx = rightIdx + rightStep;
				k = k - rightStep;
			}
		}
		int leftMax = (leftIdx - 1 < arr1.length) ? arr1[leftIdx - 1] : -1;
		int rightMax = (rightIdx - 1 < arr2.length) ? arr2[rightIdx - 1] : -1;

		return Math.max(leftMax, rightMax);
		*/
    }
}
