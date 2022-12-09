package 코테22년11월.코테2022_11_01;

/*문제
        문자열을 입력받아 해당 문자열에 등장하는 각 문자(letter)를 가지고 만들 수 있는 길이 2의 문자열들을 리턴해야 합니다.*/

public class makePermutations {
    public String makePermutations(String str) {
        // TODO:
        // if (str.isEmpty()) return ""; */

        String result = "";
        for (int front = 0; front < str.length(); front++) {
            for (int back = 0; back < str.length(); back++) {
                result += "" + str.charAt(front) + str.charAt(back) + ",";
            }
        }

        return str.isEmpty() ? "" : result.substring(0, result.length() -1);
    } // 삼항조건 연산자 조건식 ? 조건식이 참일떄 적용된 값 : 조건식이 거짓일때 적용될 값
}
