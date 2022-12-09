package 코테22년11월.코테2022_11_11;
import java.util.*;

/*문제
List를 value로 가지는 HashMap, key,
인덱스를 입력받아, key에 해당하는 키(key)가 존재하는 경우, index가 가리키는 List의 요소를 리턴해야 합니다.*/

public class GetElementOfListEntry {
    public static void main(String[] args) {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>(){{
            put("apple", Arrays.asList("apple", "red"));
            put("banana", Arrays.asList("delicious"));
        }};
        String output = Solution.getElementOfListEntry(hashMap, "apple", 1);
        System.out.println(output); // --> "red"
    }
    public static class Solution {
        public static String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
            //TODO..

            if(!hashMap.containsKey(key)) {
                return null;
            }
            if(index < 0 || index > hashMap.get(key).size()) {
                return null;
            }
            return hashMap.get(key).get(index);
        }
    }
}
