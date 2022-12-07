package 코테2022_12_08;

public class IsIsogram {
    public static void main(String[] args) {
        boolean output = isIsogram("dropOut");
        System.out.println(output);
    }
    public static boolean isIsogram(String str) {
        // TODO:
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < str.length(); j++) {
                if(i == j) continue;
                if(str.charAt(j) == str.charAt(i)) return false;
            }
        }
        return true;
    }
}
