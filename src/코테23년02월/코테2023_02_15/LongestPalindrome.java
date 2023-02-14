package 코테23년02월.코테2023_02_15;

/*
문제
문자열을 입력받아 부분 문자열 중 가장 긴 (palindrome)의 길이를 리턴해야 합니다.

palindrome: 데이터를 앞에서 뒤로 또는 뒤에서 앞으로 조회한 결과가 동일한 경우

입력
인자 1 : str
String 타입의 공백이 있는 알파벳 소문자 문자열

출력
int 타입을 리턴해야 합니다.

주의사항
문자열 str 의 부분 문자열은 자기 자신을 포함합니다.
공백도 회문에 포함될 수 있습니다.

입출력 예시
String str = "My dad is a racecar athlete";
int result = longestPalindrome(str);
System.out.println(result); // --> 11 ('a racecar a')

str = " dad ";
result = longestPalindrome(str);
System.out.println(result); // --> 5 (' dad ')

Advanced
부분 문자열 중 가장 긴 회문을 계산하는 효율적인 알고리즘(O(N^2))이 존재합니다.
쉽지 않기 때문에 바로 레퍼런스 코드를 보고 이해하는 데 집중하시기 바랍니다.
*/

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "My dad is a racecar athlete";
        int result = longestPalindrome(str);
        System.out.println(result); // --> 11 ('a racecar a')

        str = " dad ";
        result = longestPalindrome(str);
        System.out.println(result); // --> 5 (' dad ')
    }
    public static int longestPalindrome(String str) {
        if (str.length() < 2) return str.length();

        int LENGTH = str.length();
        boolean[][] isPalindrome = new boolean[LENGTH][];
        for(int i = 0; i < isPalindrome.length; i++) {
            isPalindrome[i] = new boolean[LENGTH];
        }

        int maxLen = 1;
        // 길이가 1인 회문
        for (int i = 0; i < LENGTH; i++) isPalindrome[i][i] = true;

        // 길이가 2인 회문
        for (int i = 0; i < LENGTH - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                maxLen = 2;
            }
        }

        // 길이가 3 이상인 회문
        for (int len = 3; len <= LENGTH; len++) {
            for (int startIdx = 0; startIdx <= LENGTH - len; startIdx++) {
                int endIdx = startIdx + len - 1;
                if (
                        isPalindrome[startIdx + 1][endIdx - 1] &&
                                str.charAt(startIdx) == str.charAt(endIdx)
                ) {
                    isPalindrome[startIdx][endIdx] = true;
                    maxLen = len;
                }
            }
        }

        return maxLen;
    }
}
