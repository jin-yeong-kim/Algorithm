package 코테22년11월.코테2022_11_23;

/*문제
문자열을 입력받아 순서가 뒤집힌 문자열을 리턴해야 합니다.*/

public class FirstReverse {
    public static void main(String[] args) {
        String output = firstReverse("codestates");
        System.out.println(output);
    }
    public static String firstReverse(String str) {
        // TODO:
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        String result = sb.toString();
        return result;
    }
}
