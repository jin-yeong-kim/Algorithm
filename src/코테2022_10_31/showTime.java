package 코테2022_10_31;

/*문제
시간, 분, 초를 입력받아 현재 시각을 나타내는 메세지를 리턴해야 합니다.*/

public class showTime {
    public String showTime(int hour, int min, int sec) {
        // TODO:
        return String.format("현재 시각은 %d시 %d분 %d초 입니다.", hour, min, sec);
    }
}
