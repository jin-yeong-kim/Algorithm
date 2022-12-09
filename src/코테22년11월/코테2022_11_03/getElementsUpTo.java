package 코테22년11월.코테2022_11_03;

public class getElementsUpTo {
    public int[] getElementsUpTo(int[] arr, int n) {
        // TODO:
        if(arr.length <= n){
            return new int[]{};
        }
        int[] result = new int[n];
        System.arraycopy(arr, 0, result, 0,n);
        return result;
    }
}
