package 코테2022_11_01;

/*문제
수를 입력받아 약수(factor)의 합을 리턴해야 합니다.*/

public class getSumOfFactors {
    public int getSumOfFactors(int num) {
        // TODO:
        // 약수가 뭐죵
        // 약수를 구하는 알고리즘을 짜야하네요?
        // 8을 i만큼 나눠준 다음에 나눈 값과 num값을 변수에 넣어주고 한 번에 다 더하기
        // 약수의 정의: 나눠서 0나오는거
        int facor_sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                facor_sum += num/i;
            }
        }
        return facor_sum;
    }
}
