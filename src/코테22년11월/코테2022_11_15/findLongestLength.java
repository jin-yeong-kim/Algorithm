package 코테22년11월.코테2022_11_15;

import java.util.Arrays;

public class findLongestLength {
    public static void main(String[] args) {
        String[] strArr = {"codestates", "java", "backend", "programming"};
        int output = findLongestLength(strArr);
        System.out.println(output); // 11 (가장 긴 문자열 : programming)
    }
    public static int findLongestLength(String[] strArr) {
        //TODO..
        // 빈 배열인 경우 0리턴
        // 스트림 생성
        // 맵핑
        // 최대값 리턴
        return Arrays.stream(strArr).mapToInt(s -> s.length()).max().orElse(0);
    }
}
