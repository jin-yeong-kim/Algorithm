package 코테22년11월.코테2022_11_03;

public class getAllElementsButNth {
    public int[] getAllElementsButNth(int[] arr, int n) {
        if (n >= arr.length) {
            return arr;
        }

        int[] result = new int[arr.length - 1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == n) {
                continue;
            }
            result[index] = arr[i];
            index++;
        }
        return result;
    }
}
