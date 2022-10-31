package 코테2022_10_31;

/*문제
숫자(int) 하나를 입력받아 알맞은 문자(char)를 리턴합니다.*/

public class convertToChar {
    public char convertToChar(int num) {
        char result;
        // TODO: 여기에 코드를 작성합니다.
        result = (char)(num + '0');
        //하단의 코드는 수정하지 말아야 합니다.
        return result;
    }
}
