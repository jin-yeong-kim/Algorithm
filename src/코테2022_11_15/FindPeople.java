package 코테2022_11_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindPeople {
    public static void main(String[] args) {
        List<String> male = Arrays.asList("김코딩", "최자바", "김코츠");
        List<String> female = Arrays.asList("박해커", "김유클", "김코딩");
        List<String> output = findPeople(male, female, "김");
        System.out.println(output); // ["김유클", "김코딩", "김코츠"]
    }
    public static List<String> findPeople(List<String> male, List<String> female, String lastName) {
        //TODO..
        Stream<String> stream = Stream.concat(male.stream(),female.stream());
        return stream.distinct().filter(s -> s.startsWith(lastName)).sorted().collect(Collectors.toList());
    }
}
