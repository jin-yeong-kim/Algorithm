package 코테22년11월.코테2022_11_11;
import java.util.*;
/*문제
<Character, Integer> 타입을 요소로 가지는 HashMap을 입력받아 짝수 값(Value) 끼리
모두 더한 값을 리턴해야 합니다.*/
public class AddEvenValues {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>(){{
            put('a', 1);
            put('b', 4);
            put('c', 6);
            put('d', 9);
        }};
        int output = Solution.addOddValues(hashMap);
        System.out.println(output); // --> 10
    }
    public static class Solution {
        public static int addOddValues(HashMap<Character, Integer> hashMap) {
            //TODO..
            int result = 0;

            for(Character key : hashMap.keySet()) {
                int a = 0;
                a = hashMap.get(key);
                if(a % 2== 0) {
                    result += a;
                }
            }
            return result;
        }
    }
}
