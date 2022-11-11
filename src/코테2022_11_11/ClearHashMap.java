package 코테2022_11_11;
import java.util.*;
/*문제
<Integer, Boolean> 타입을 요소로 가지는 HashMap을 입력받아 모든 Entry를 제거합니다.*/
public class ClearHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>(){{
            put(1, true);
            put(3, false);
            put(5, true);
        }};
        Solution.clearHashMap(hashMap);
        System.out.println(hashMap); // --> {}
    }
    public static class Solution {
        public static void clearHashMap(HashMap<Integer, Boolean> hashMap) {
            //TODO..
            hashMap.clear();
        }
    }
}
