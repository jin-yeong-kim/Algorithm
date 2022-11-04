package 코테2022_11_04;

public class FollowingDay {
    public String followingDay(String day) {
        // TODO:
        String a = "";
        switch (day){
            case "월요일" :  a = "화요일"; break;
            case "화요일" :  a = "수요일"; break;
            case "수요일" :  a = "목요일"; break;
            case "목요일" :  a = "금요일"; break;
            case "금요일" :  a = "토요일"; break;
            case "토요일" :  a = "일요일"; break;
            case "일요일" :  a = "월요일"; break;
            default :  a = "올바른 요일이 아닙니다"; break;
        } return a;
    }
}
