package 코테22년12월.코테2022_12_06;

/*문제
수를 요소로 갖는 배열을 입력받아 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 리턴해야 합니다.

입력
인자 1 : arr
int타입을 요소로 갖는 배열
arr[i]는 정수

출력
boolean 타입을 리턴해야 합니다.
arr[i]는 arr[0]부터 arr[i-1]까지의 합보다 커야 합니다.*/

public class SuperIncreasing {
    public static void main(String[] args) {
        boolean output = superIncreasing(new int[]{-2247, 1093, 1064});
        System.out.println(output);
    }
    public static boolean superIncreasing(int[] arr) {
        // TODO:
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(sum >= arr[i]) return false;
            sum += arr[i];
        }
        return true;
    }
}
