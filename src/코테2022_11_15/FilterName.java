package 코테2022_11_15;

import java.util.Arrays;
import java.util.List;

public class FilterName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "김자바");
        String[] output = filterName(names);
        System.out.println(output); // {"김자바", "김코딩"};
    }
    public static String[] filterName(List<String> names) {
        //TODO..
        // 스트림 생성
        // 중복제거
        // 김씨성 필터링
        // 정렬
        // 배열 변환 뒤 리턴
        return names.stream().distinct().filter(s -> s.startsWith("김")).sorted().toArray(String[]::new);
    }
}
