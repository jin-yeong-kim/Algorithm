package 코테22년10월.코테2022_10_31;

/*문제
두 개의 문자열을 입력받아 대소문자를 구분하지 않고(case insensitive) 서로 같은지 여부를 리턴해야 합니다.*/

public class compareOnlyAlphabet {
    public boolean compareOnlyAlphabet(String str1, String str2) {
        // TODO:
        //1. 두 개 다 대문자 또는 소문자로 바꿈.
        //2. 내용이 같은지 비교 ->
        return str1.toLowerCase().equals(str2.toLowerCase());
    }
}
