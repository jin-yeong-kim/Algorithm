package 코테2022_10_31;

/*문제
문자(Character) 하나를 입력받아 알맞은 값(int)을 리턴합니다.*/

public class convertToNumber {
    public int convertToNumber(char character) {
        int result;
        // TODO: 여기에 코드를 작성합니다.
        result = Character.getNumericValue(character);
        //하단의 코드는 수정하지 말아야 합니다.
        return result;
    }
}
