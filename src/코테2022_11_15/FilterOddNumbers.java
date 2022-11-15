package 코테2022_11_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = Solution.filterOddNumbers(list);
        System.out.println(output); // --> [2, 4]
    }
    public class Solution {
        public static List<Integer> filterOddNumbers(List<Integer> list){
            //TODO..
            return list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        }
    }
}
