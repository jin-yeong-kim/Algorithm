package 코테2022_11_11;
import java.util.*;

/*문제
String 타입을 요소로 가지는 배열과 <String, Integer> 타입을 요소로 가지는 HashMap을 입력받아,
 배열의 각 요소들을 HashMap의 키로 했을 때 그 값을 추출하여 만든 새로운 HashMap을 리턴해야 합니다.*/

public class Select {
    public static void main(String[] args) {
        String[] arr = {"a", "c", "e"};
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){
            {
                put("a", 1);
                put("b", 2);
                put("c", 3);
            }};
        HashMap<String, Integer> output = Solution.select(arr, hashMap);
        System.out.println(output); // --> { "a"=1, "c"=3 }
    }
    public static class Solution {
        public static HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
            //TODO..
            HashMap<String, Integer> result = new HashMap<>();

            for(String key : arr) {
                if(hashMap.containsKey(key)) {
                    result.put(key, hashMap.get(key));
                }
            }
            return result;
        }
    }
}
