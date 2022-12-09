package 코테22년11월.코테2022_11_15;

import java.util.Arrays;
import java.util.List;

public class ComputeAverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double output = Solution.computeAverageOfNumbers(list);
        System.out.println(output); // --> 3
    }
    public class Solution {
        public static double computeAverageOfNumbers(List<Integer> list) {
            //TODO..
            return list.stream().mapToDouble(d -> d).average().orElse(0);
        }
    }
}
