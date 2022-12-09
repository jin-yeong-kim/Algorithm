package 코테22년11월.코테2022_11_01;

/*문제
두 개의 수를 입력받아 두 수를 포함해 두 수 사이의 수 중 2의 배수의 개수를 리턴해야 합니다*/

public class makeMultiplesOfDigit2 {
    public int makeMultiplesOfDigit2(int num1, int num2) {
        //TODO:
        int i = 0;
        int count = 0;
        if (num1 >= num2) {
            for (i = num2; i <= num1; i++) {
                if (i == 0) {
                    continue;
                }

                if (i % 2 == 0) {
                    count++;
                }
            }
        } else {
            for (i = num1; i <= num2; i++) {
                if (i == 0) {
                    continue;
                }

                if (i % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
