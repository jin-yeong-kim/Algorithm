package 코테2022_11_02;

public class computeSumOfAllElements {
    public int computeSumOfAllElements(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
