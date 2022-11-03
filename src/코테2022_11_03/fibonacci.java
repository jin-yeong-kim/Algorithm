package 코테2022_11_03;

public class fibonacci {
    public int[] fibonacci(int num) {
        // TODO:
        int[] fibo = new int[num + 1];

        for (int i = 0; i <= num; i++){
            if (i <= 1) fibo[i] = i;
            else fibo[i] = fibo[i - 2] + fibo[i - 1];
        }

        return fibo;
    }
}
