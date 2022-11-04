package 코테2022_11_04;

public class addOneSecond {
    public String addOneSecond(int hour, int minute, int second) {
        // TODO:
        if((second + 1) == 60){
            if((minute + 1) == 60){
                if((hour + 1) == 24){
                    hour = 0;
                    minute = 0;
                    second = 0;
                } else {hour ++;second = 0;minute = 0;}
            } else {minute ++;second = 0;}
        } else second ++;
        return String.format("1초 뒤에 %d시 %d분 %d초 입니다", hour, minute, second);
    }
}
