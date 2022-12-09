package 코테22년11월.코테2022_11_15;

import java.util.Arrays;
import java.util.List;

public class ComputeAverageOfMaleMember {
    public static void main(String[] args) {
        Member coding = new Member("coding", "Female", 25);
        Member hacker = new Member("hacker", "Male", 30);
        Member ingi = new Member("ingi", "Male", 32);
        List<Member> members = Arrays.asList(coding, hacker, ingi);
        double output = computeAverageOfMaleMember(members);
        System.out.println(output); // --> 31.0
    }
    public static  double computeAverageOfMaleMember(List<Member> members) {
        //구현된 Member 클래스의 getName(), getGender(), getAge() 메소드로 해당 Member 클래스의 name, gender, age를 확인할 수 있습니다.
        //TODO..
        return members.stream().filter(s -> s.getGender() == "Male").mapToDouble(Member::getAge).average().orElse(0.0);
    }

    // 아래 코드는 변경하지 마세요.
    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
