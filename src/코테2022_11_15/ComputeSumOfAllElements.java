package 코테2022_11_15;

import java.util.Arrays;
import java.util.List;

public class ComputeSumOfAllElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int output = Solution.computeSumOfAllElements(list);
        System.out.println(output); // --> 15
    }
    public class Solution {
        public static int computeSumOfAllElements(List<Integer> list){
            //TODO..
            return list.stream().mapToInt(number -> number).sum();
        }
    }
}
