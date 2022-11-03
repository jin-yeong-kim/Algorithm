package 코테2022_11_03;

public class mergeArrays {
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        // TODO:
        int[] answer = new int[arr1.length + arr2.length]; // { 0, 0, 0, 0 }

        System.arraycopy(arr1, 0, answer, 0, arr1.length); // { 1, 2, 0, 0 }
        System.arraycopy(arr2, 0, answer, arr1.length, arr2.length); // { 1, 2, 3, 4 }

        return answer;
    }
}
