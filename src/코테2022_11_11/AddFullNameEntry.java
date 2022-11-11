package 코테2022_11_11;
import java.util.*;
/*문제
한 사람의 firstName, lastName Entry가 저장되어있는
HashMap을 입력 받아, fullName 이라는 새 Entry를 HashMap에 저장하고 해당 HashMap을 리턴해야 합니다.*/
public class AddFullNameEntry {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>(){{
            put("firstName", "김");
            put("lastName", "코딩");
        }};
        HashMap<String, String> output =  Solution.addFullNameEntry(hashMap);
        System.out.println(output); // --> {firstName=김, fullName=김코딩, lastName=코딩}
    }
    public static class Solution {
        public static HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
            //TODO..
            hashMap.put("fullName", hashMap.get("firstName") + hashMap.get("lastName"));
            return hashMap;
        }
    }
}
