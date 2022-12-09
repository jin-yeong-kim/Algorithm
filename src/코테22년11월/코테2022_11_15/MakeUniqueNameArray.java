package 코테22년11월.코테2022_11_15;

import java.util.Arrays;
import java.util.List;

public class MakeUniqueNameArray {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "박해커");
        String[] output = makeUniqueNameArray(names);
        System.out.println(output); // {"김코딩", "박해커", "최자바"};
    }
    public static String[] makeUniqueNameArray(List<String> names) {
        //TODO..
        return names.stream().distinct().sorted().toArray(String[]::new);
    }
}
