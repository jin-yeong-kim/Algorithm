package 코테22년11월.코테2022_11_21;

/*문제
수를 입력받아 2의 거듭제곱인지 여부를 리턴해야 합니다.*/

public class PowerOfTwo {
    public static void main(String[] args) {
        boolean output1 = powerOfTwo(32);
        System.out.println(output1);
    }
    public static boolean powerOfTwo(long num) {
        // TODO:
        if(num == 1) return true;
        if(num % 2 != 0) return false;
        int i = 2;
        while(i < num) {
            i *= 2;
        }
        return i == num;
    }
}
