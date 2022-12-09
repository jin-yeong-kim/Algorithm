package 코테22년11월.코테2022_11_01;

/*문제
수를 입력받아 1부터 해당 수까지의 수 중에서 3의 배수로만 구성된 문자열을 리턴해야 합니다.*/

public class makeMultiplesOfDigit {
    public String makeMultiplesOfDigit(int num) {
        // TODO:
        int i = 3;
        int j = 0;
        String result = "";

        for (i = 3; i <= num; i += 3) {
            result += Integer.toString(i);
        }
        return result;
    }
}
