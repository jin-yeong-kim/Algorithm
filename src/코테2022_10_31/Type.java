package 코테2022_10_31;

/*문제
변수 thing에 문자(char) 'A'를 할당하고, 변수 num에 숫자(int) 3을 할당합니다.*/

public class Type {
    public String type() {
        int num;
        char thing;

        //TODO :
        num = 3;
        thing = 'A';
        //아래 코드는 수정하지 말아야 합니다.
        return goCheck(num, thing);
    }

    //아래 메소드는 수정하지 말아야 합니다.
    public String goCheck(int num, char thing) {
        return String.format("코딩아, 공구함에 있는 건전지말야. %c가 %d개 들어있는게 맞니?", thing, num);
    }
}
