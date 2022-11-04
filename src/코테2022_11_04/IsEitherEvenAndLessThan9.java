package 코테2022_11_04;

public class IsEitherEvenAndLessThan9 {
    public boolean isEitherEvenAndLessThan9(int num1, int num2) {
        // TODO:
        if((num1 % 2 == 0 || num2 % 2 == 0) && (num1 < 9 && num2 < 9)) return true;
        return false;
    } /*return (num1 % 2 == 0 || num2 % 2 == 0) && (num1 < 9 && num2 < 9); 한줄로도 표현가능*/
}
