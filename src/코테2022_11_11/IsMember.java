package 코테2022_11_11;
import java.util.*;

/*문제
회원 정보(username, password)가 저장되어있는 HashMap이 있습니다. username과 password를 입력받아 HashMap에 저장된
회원정보와 일치한지 확인하려 합니다. 입력받은 username과 password를 이용해 회원이 맞는지 여부를 리턴해야 합니다.*/

public class IsMember {
    public static void main(String[] args) {
        HashMap<String, String> member = new HashMap<String, String>(){{
            put("kimcoding", "1234");
            put("parkhacker", "qwer");
        }};
        boolean output = Solution.isMember(member, "parkhacker", "qwer");
        System.out.println(output); // --> true
    }
    public static class Solution {
        public static boolean isMember(HashMap<String, String> member, String username, String password) {
            //TODO..
            if(member.containsKey(username) && member.containsValue(password)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
