package 코테2022_11_04;

public class hasRepeatedCharacter {
    public boolean hasRepeatedCharacter(String str) {
        // TODO:
        for(int i = 0;i < str.length() - 1;i++){
            for(int j = i + 1;j < str.length();j++){
                if(str.charAt(i) == str.charAt(j)) return true;
            }
        }
        return false;
    }
}
