package 코테2022_11_22;

import java.util.StringTokenizer;

public class FirstCharacter {
    public static void main(String[] args) {
        String output = firstCharacter(
                "The community at Code States might be the biggest asset"
        );
        System.out.println(output);
    }
    public static String firstCharacter(String str) {
        // TODO:
        StringTokenizer st = new StringTokenizer(str," ");
        String result = "";
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            char tk = token.charAt(0);
            result += String.valueOf(tk);
        }
        return result;
    }
}
