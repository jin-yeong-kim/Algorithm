package 코테22년11월.코테2022_11_11;
import java.util.*;
/*문제
<String, Integer> 타입을 요소로 가지는
HashMap과 문자열을 입력받아, HashMap에 문자열을 key로 한 Entry가 있는지의 여부를 리턴해야 합니다.*/
public class IsContain {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){{
            put("김코딩", 20);
            put("박해커", 25);
            put("최자바", 30);
        }};
        boolean output = Solution.isContain(hashMap, "김코딩");
        System.out.println(output); // --> true
    }
    public static class Solution {
        public static boolean isContain(HashMap<String, Integer> hashMap, String key) {
            //TODO..
            return hashMap.containsKey(key);
        }
    }
}
