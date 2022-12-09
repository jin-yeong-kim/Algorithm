package 코테22년11월.코테2022_11_02;

public class getAllWords {
    public String[] getAllWords(String str) {
        // TODO:
        return str.isEmpty() ? new String[] {} : str.split(" ");
    }
}
