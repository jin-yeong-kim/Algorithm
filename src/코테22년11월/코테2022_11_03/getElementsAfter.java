package 코테22년11월.코테2022_11_03;

public class getElementsAfter {
    public int[] getElementsAfter(int[] arr, int n) {
        // TODO:
        if (n >= arr.length) {
            return new int[]{};
        }
        int[] result = new int[arr.length - n];
        System.arraycopy(arr, n, result, 0, arr.length - n);
        return result;
    }
}
