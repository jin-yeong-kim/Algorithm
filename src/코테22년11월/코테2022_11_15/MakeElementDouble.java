package 코테22년11월.코테2022_11_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeElementDouble {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = makeElementDouble(list);
        System.out.println(output); // [2, 4, 6, 8, 10]
    }
    public static List<Integer> makeElementDouble(List<Integer> list) {
        //TODO..
        // 스트림 생성
        // 맵핑
        // 각 요소의 곱하기
        // 리스트로 변환 한 뒤 리턴
        return list.stream().map(n -> n * 2).collect(Collectors.toList());
    }
}
