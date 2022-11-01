package 코테2022_11_01;

/*문제
1 이상의 자연수를 입력받아 소수(prime number)인지 여부를 리턴해야 합니다.*/

public class isPrime {
    public boolean isPrime(int num) {
        // TODO:
        // 의 사 코 드 //
        // 반복문을 사용해서 풀어갈건데
        // i를 사용해서 num을 2, 3, 4, 5, ...... , num - 1으로 나눠줄거에요
        // 그래서 한 번이라도 나누어 떨어지면 소수 아님
        // 한 번도 안 나누어 떨어지면 소수임
        if (num == 2) return true;
        if (num == 1 || num % 2 == 0) return false;
//Math.sqrt() 제곱근
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        } return true;
        // 모든 홀수는 짝수로는 나눠지지 않음
    }
}
