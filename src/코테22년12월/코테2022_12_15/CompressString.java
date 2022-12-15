package 코테22년12월.코테2022_12_15;

/*문제
문자열을 입력받아 연속되는 문자가 있을 경우, 연속 구간을 반복되는 수와 문자로 조합한 형태로 압축한 문자열을 리턴해야 합니다.

입력

인자 1 : str
String 타입의 알파벳 문자열

출력
String 타입을 리턴해야 합니다.

주의 사항
빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
3개 이상 연속되는 문자만 압축합니다.*/

public class CompressString {
    public static void main(String[] args) {
        String output = compressString("wwwggoppopppp");
        System.out.println(output);
    }
    public static String compressString(String str) {
        // TODO:
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(i + 1 < str.length()) {
               if(str.charAt(i) == str.charAt(i + 1)) {
                   count++;
                   continue;
               } else if(str.charAt(i) != str.charAt(i + 1)) {
                   if(count >= 3) {
                       sb.append(count);
                       sb.append(str.charAt(i));
                       count = 1;
                       continue;
                   }
               }
            }
            if(count >= 3) {
                sb.append(count);
            } else if(count == 2) {
                sb.append(str.charAt(i));
            }
            sb.append(str.charAt(i));
            count = 1;
        }
        return sb.toString();
    }
}
