package 코테2022_11_11;

import java.util.HashMap;
import java.util.*;
/*문제
<Integer, Integer> 타입을 요소로 가지는 HashMap을 입력받아 Entry의 개수를 출력합니다.
*/
public class GetSize {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(){{
            put(1, 10);
            put(2, 20);
            put(3, 30);
        }};
        int output = Solution.getSize(hashMap);
        System.out.println(output); // --> 3
    }
    public static class Solution {
        public static int getSize(HashMap<Integer, Integer> hashMap) {
            //TODO..
            return hashMap.size();
        }
    }
}
