package 코테2022_11_02;

public class getAllLetters {
    public char[] getAllLetters(String str) {
        // TODO:
        char[] result = new char[str.length()];

        for(int i =0;i<str.length();i++){
            result[i] = str.charAt(i);
        }

        return result;
    }
}
