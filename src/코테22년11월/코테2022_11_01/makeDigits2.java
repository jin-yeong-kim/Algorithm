package 코테22년11월.코테2022_11_01;

/*문제
수(num)를 입력받아 1부터 num까지의 정수로 구성된 문자열을 리턴해야 합니다.*/

public class makeDigits2 {
    public String makeDigits2(int num) {
        // TODO:
        String str = "";
        String result = "";
        int i = 1;
        while(i <= num) {
            str = Integer.toString(i);
            result += str;
            if (i == num) {
                break;
            }
            result += "-";
            i++;
        }
        return result;
    }
}
