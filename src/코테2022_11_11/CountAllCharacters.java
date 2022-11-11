package 코테2022_11_11;
import java.util.*;

/*문제
문자열을 입력받아 문자열을 구성하는 각 문자(letter)를 키로 갖는 HashMap을 리턴해야 합니다.
각 키의 값은 해당 문자가 문자열에서 등장하는 횟수를 의미하는 int 타입의 값이어야 합니다.*/

public class CountAllCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> output = Solution.countAllCharacter("banana");
        System.out.println(output);
    }
    public static class Solution {

        public static HashMap<Character, Integer> countAllCharacter(String str) {
            //TODO..
            if(str.length() == 0) {
                return null;
            }

            HashMap<Character, Integer> result = new HashMap<>();

            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(result.containsKey(c)) { // 키를 가지고 있을 때
                    result.put(c, result.get(c) + 1);
                } else { // 키가 없을 때
                    result.put(c, 1); // 새로운 키 생성
                }
            }
            return result;
        }
    }
}
