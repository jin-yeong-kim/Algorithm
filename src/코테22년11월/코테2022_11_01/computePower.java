package 코테22년11월.코테2022_11_01;

/*문제
밑(base)과 지수(exponent)를 입력받아 밑의 거듭제곱을 리턴해야 합니다.*/

public class computePower {
    public int computePower(int base, int exponent) {
        // TODO:
        int output = 0;
        for(int i =0;i < exponent ;i++){
            output += base * base;
        } if (exponent == 0){
            return output = 1;
        } else
            return output;
    }
}
