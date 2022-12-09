package 코테22년11월.코테2022_11_01;

/*문제
숫자 문자열을 입력받아 문자열을 구성하는 각 숫자 중 가장 큰 수를 나타내는 숫자를 리턴해야 합니다.*/

public class getMaxNumberFromString {
    public int getMaxNumberFromString(String str) {
        // TODO:
        int x = 0;
        int i = 0;
        int y = 0;
        for(int j =0;j < str.length() - 1;j++){
            i = str.charAt(j) - '0';
            y = str.charAt(j+1) - '0';
            x = Math.max(i,y);
        } return x;
    } /* int max =0;
      for (int i =0; i < = str.length() - 1; i++) {
        int num = str.charAt(i) - '0'; 인트에다가 캐릭터를 넣으면 유니코드로 변환되기 때문에 캐릭터 0인 48번을 넣어
        일반 숫자로 바꾼다.
        if (num > max) max = num;
      } return max;*/
}
