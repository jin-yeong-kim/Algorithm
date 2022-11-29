package 코테2022_11_29;

public class AB {
    public static void main(String[] args) {
        boolean output = ABCheck("aMAJ7sBrO4CyysuoHFrgGTX");
        System.out.println(output);
    }
    public static boolean ABCheck(String str) {
        // TODO:
        str = str.toLowerCase();
        for(int i = 4; i < str.length(); i++) {
            if((str.charAt(i) == 'a' && str.charAt(i - 4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i - 4) == 'a')) {
                return true;
            }
        }
        return false;
    }
}
