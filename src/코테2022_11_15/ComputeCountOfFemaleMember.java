package 코테2022_11_15;

import java.util.Arrays;
import java.util.List;

public class ComputeCountOfFemaleMember {
    public static void main(String[] args) {
        Solution.Member coding = new Solution.Member("coding", "Female");
        Solution.Member hacker = new Solution.Member("hacker", "Male");
        List<Solution.Member> members = Arrays.asList(coding, hacker);
        long output = Solution.computeCountOfFemaleMember(members);
        System.out.println(output); // --> 1
    }
    public class Solution {
        public static long computeCountOfFemaleMember(List<Member> members) {
            //구현된 Member 클래스의 getName(), getGender() 메소드로 해당 Member 클래스의 name, gender를 확인할 수 있습니다.
            //TODO..
            return members.stream().filter(s -> s.getGender() == "Female").count();
        }

        // 아래 코드는 변경하지 마세요.
        static class Member {
            String name;
            String gender;

            public Member(String name, String gender) {
                this.name = name;
                this.gender = gender;
            }

            public String getName() {
                return name;
            }

            public String getGender() {
                return gender;
            }
        }
    }
}
