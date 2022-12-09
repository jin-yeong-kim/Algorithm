package 코테22년11월.코테2022_11_01;

/*문제
문자열과 문자를 입력받아 문자열에서 문자(letter)가 등장하는 횟수를 리턴해야 합니다.*/

public class countCharacter {
    public int countCharacter(String str, char letter) {
        // TODO:
        String result = "";
        int j = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == letter){
                j += 1;
            }
        } return j;
    }
}
