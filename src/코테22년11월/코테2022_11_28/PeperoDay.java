package 코테22년11월.코테2022_11_28;

import java.util.ArrayList;
import java.util.Arrays;

public class PeperoDay {
    public static void main(String[] args) {
        int M = 4;
        int N = 8;
        ArrayList<Integer[]> output = divideChocolateStick(M, N);
        System.out.println(output);
    }
    public static ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        // TODO:
        ArrayList<Integer[]> result = new ArrayList<>();
        int count = 0;
        for(int i = 0; i <= M; i++) {
            if(M % i == 0 && N % i == 0) {
                count++;
                M /= i;
                N /= i;
                int[] n = {count,M,N};
                Integer[] num = Arrays.stream(n).boxed().toArray(Integer[]::new);
                result.add(num);
            }
        }
        return result;
    }
}
