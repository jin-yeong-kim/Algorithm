package 코테22년12월.코테2022_12_21;

/*
문제
두 개의 배열(base, sample)을 입력받아 sample이 base의 부분집합인지 여부를 리턴해야 합니다.

입력
인자 1 : base
int 타입을 요소로 갖는 임의의 배열
base.length는 50,000 이하
인자 2 : sample
int 타입을 요소로 갖는 임의의 배열
sample.length는 50,000 이하

출력
boolean 타입을 리턴해야 합니다.

주의사항
base, sample 내에 중복되는 요소는 없다고 가정합니다.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output);
    }
    public static boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
        // int count = 0;
        // for(int i = 0; i < sample.length; i++) {
        // 	for(int j = 0; j < base.length; j++) {
        // 		if(sample[i] != base[j]) {
        // 			continue;
        // 		} else if(sample[i] == base[j]) {
        // 			count++;
        // 		}
        // 	}
        // }
        // if(count != sample.length) return false;
        // return true;
        List<Integer> arr =
                Arrays.stream(base)
                        .boxed()
                        .collect(Collectors.toList());
        for(int i: sample) {
            if(!arr.contains(i)) return false;
        }
        return true;
    }
}
