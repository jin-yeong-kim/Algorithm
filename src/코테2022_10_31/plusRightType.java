package 코테2022_10_31;

/*문제
score에 숫자 100이 할당되도록 하기 코드를 수정하세요.*/

public class plusRightType {
    public int plusRightType(){
        // TODO : 변수 score에 숫자 100이 할당되도록 하기 코드를 수정하세요.
        int score = 99 + Character.getNumericValue('1'); // 해당 부분을 수정해야 합니다.

        //하단의 코드는 수정하지 말아야 합니다.
        return score;
    }
}
