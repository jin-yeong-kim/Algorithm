package 코테2022_11_02;

public class getNthElement {
    public int getNthElement(int[] arr, int index) {
        // TODO:
        if (arr.length == 0) return -1;
        if (arr.length <= index) return -2;
        return arr[index];
    }
}
