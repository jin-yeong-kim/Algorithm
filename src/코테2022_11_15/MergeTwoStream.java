package 코테2022_11_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoStream {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("김코딩", "박해커");
        List<String> list2 = Arrays.asList("최자바", "이스프링");
        List<String> output = mergeTwoStream(list1, list2);
        System.out.println(output); // ["김코딩", "박해커", "최자바", "이스프링"]
    }
    public static List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        //TODO..
        // 각각의 스트림 합치기
        // 리스트로 합친 결과를 리턴
        // Stream<String> stream1 = list1.stream();
        // Stream<String> stream2 = list2.stream();
        Stream<String> stream3 = Stream.concat(list1.stream(), list2.stream());
        return stream3.collect(Collectors.toList());
    }
}
