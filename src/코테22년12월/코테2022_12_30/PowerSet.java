package 코테22년12월.코테2022_12_30;

/*문제
하나의 집합을 의미하는 문자열을 입력받아 각 문자를 가지고 만들 수 있는 모든 부분집합을 리턴해야 합니다.

입력
인자 1 : str
String 타입의 공백이 없는 알파벳 소문자 문자열

출력
ArrayList<String>을 리턴해야 합니다.
ArrayList의 요소는 각 부분집합의 원소로 구성된 문자열

주의사항
ArrayList의 요소는 각 부분집합을 구성하는 원소를 연결한 문자열입니다.
ArrayList의 요소는 알파벳 순서로 정렬되어야 합니다.
집합은 중복된 원소를 허용하지 않습니다.
부분집합은 빈 문자열을 포함합니다.
ArrayList는 오름차순으로 정렬되어야 합니다.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class PowerSet {
    public static void main(String[] args) {
        ArrayList<String> output1 = powerSet("abc");
        System.out.println(output1); // ["", "a", "ab", "abc", "ac", "b", "bc", "c"]
    }
    public static ArrayList<String> powerSet(String str) {

        // 정렬
        String deduplStr = deduplicated(str);
        Stack<String> stack = new Stack<>();

        ArrayList<String> result = new ArrayList<>();

        result = pickOrNot(stack, 0, deduplStr, result);
        // 오름차순으로 정렬
        Collections.sort(result);
        return result;
    };
    // 중복 제거를 위한 메서드를 작성합니다.
    public static String deduplicated(String str) {
        String result = "";
        //indexOf 메서드를 통해 중복여부를 확인합니다.
        for(int index = 0; index < str.length(); index++) {
            if(str.indexOf(str.charAt(index)) == index) {
                result += str.charAt(index);
            }
        }

        String[] sorted = result.split("");
        Arrays.sort(sorted);
        result = String.join(",", sorted).replaceAll(",", "");
        return result;
    }
    // 모든 조합을 검사하는 재귀 함수를 작성합니다.
    public static ArrayList<String> pickOrNot(Stack<String> stack, int idx, String subset, ArrayList<String> result) {
        // 재귀 함수이기 때문에 탈출 조건을 만듭니다.
        if(idx >= subset.length()) {
            // 만약, idx와 sideDishes의 길이가 같거나 크다면(마지막까지 검토한 경우) 스택을 문자열로 변환한 후, 해당 스택을 result에 넣어줍니다.
            result.add(stack.toString()
                    .replaceAll("\\[", "")
                    .replaceAll("]", "")
                    .replaceAll(",", "")
                    .replaceAll(" ", ""));
            return result;
        } else {
            // idx가 부분집합에 포함된 경우
            stack.push(Character.toString(subset.charAt(idx)));
            pickOrNot(stack, idx + 1, subset, result);

            // idx가 부분집합에 포함되지 않은 경우
            stack.pop();
            pickOrNot(stack, idx + 1, subset, result);
        }
        return result;
    }
}
