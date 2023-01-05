package 코테23년01월.코테2023_01_05;

/*문제
정수를 요소로 갖는 배열을 입력받아 오름차순으로 정렬하여 리턴해야 합니다.

입력
인자 1 : arr
int 타입을 요소로 갖는 배열
arr[i]는 정수
arr.length는 100,000 이하

출력
int 타입을 요소로 갖는 배열을 리턴해야 합니다.
배열의 요소는 오름차순으로 정렬되어야 합니다.
arr[i] <= arr[j] (i < j)

주의사항
퀵 정렬을 구현해야 합니다.
arr.sort 사용은 금지됩니다.
입력으로 주어진 배열은 중첩되지 않은 1차원 배열입니다.*/

public class QuickSort {
    public static void main(String[] args) {
        int[] output = quickSort(new int[]{3, 1, 21});
        System.out.println(output);
    }
    public static int[] quickSort(int[] arr) {
        // TODO:
        int[] result = new int[arr.length];
        quickSort(arr, 0, arr.length - 1);
        for(int i = 0 ; i < arr.length ; i++) {
            result[i] = arr[i];
        }
        return result;
    }
    static void swap(int[] data, int pl, int pr) {
        int temp = data[pl];
        data[pl] = data[pr];
        data[pr] = temp;
    }

    static void quickSort(int[] data, int left, int right) { // left, right는 각 커서의 시작점
        int pl = left;
        int pr = right;
        int pivot = data[(pl + pr) / 2]; // 피벗은 각 끝의 커서의 중간 값으로 선택

        do {
            while (data[pl] < pivot) { // data[pl] 값이 pivot보다 큰 수 탐색
                pl++;
            }
            while (data[pr] > pivot) { // data[pr] 값이 pivot보다 작은 수 탐색
                pr--;
            }
            if (pl <= pr) { // pl보다 pr이 크면 교환(오름차순)
                swap(data, pl++, pr--);
            }
        } while (pl <= pr);

        // 정렬 끝난 후 나누어진 두개의 그룹에 데이터 수를 체크
        if (left < pr)
            quickSort(data, left, pr); // left가 pr보다 작으면 그룹의 수가 1개 이상이기 때문에 다시 정렬
        if (pl < right)
            quickSort(data, pl, right); // pl이 right보다 작으면 그룹의 수가 1개 이상이기 때문에 다시 정렬
    }
}
