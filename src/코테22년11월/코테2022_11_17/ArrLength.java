package 코테22년11월.코테2022_11_17;

public class ArrLength {
    public static void main(String[] args) {
        int output = arrLength(new int[]{1, -2, 1, 3});
        System.out.println(output);
    }
    static int count = 0;
    public static int arrLength(int[] arr){
        // TODO:
        if(arr.length == 0) return count;
        count++;
        int[] a = new int[arr.length - 1];
        System.arraycopy(arr,1,a,0,arr.length-1);
        return arrLength(a);
    }
}
