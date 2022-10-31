package 코테2022_10_31;

/*문제
이름과 성을 입력받아 띄어쓰기 하나를 사이에 둔 단일 문자열을 리턴해야 합니다.*/

public class getFullName {
    public String getFullName(String firstName, String lastName) {
        // TODO:
        // 성과 이름을 합쳐야 된다
        // 성과 이름 사이에 공백이 있어야 된다.
        String result = firstName + " " + lastName;
        return result;
    }
}
