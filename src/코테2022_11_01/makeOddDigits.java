package 코테2022_11_01;

/*문제
수(num)를 입력받아 1을 포함하여 num개의 홀수로 구성된 문자열을 리턴해야 합니다.*/

public class makeOddDigits {
    public String makeOddDigits(int num) {
        // TODO:
        String result = "";
        String str = "";
        int i = 1;
        int j = 0;
        while (j < num) {
            str = Integer.toString(i);

            result += str;
            i = i +2;
            j++;
        }
        return result;
    }
}
