package 코테2022_10_31;

/*문제
두 수를 입력받아 두 수의 차이를 나타내는 메세지를 리턴해야 합니다.*/

public class computeDifference {
    public String computeDifference(int num1, int num2) {
        // TODO:
        return String.format("%d, %d의 차이는 %d입니다.", num1, num2, Math.abs(num1 - num2));
    }
}
