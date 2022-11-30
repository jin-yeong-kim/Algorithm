package 코테2022_11_30;

public class InsertDash {
    public static void main(String[] args) {
        String output = insertDash("454793");
        System.out.println(output);
    }
    public static String insertDash(String str) {
        // TODO:
        if(str.length() == 0) return null;
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < str.length(); i++) {
            sb.append(str.charAt(i - 1));
            if(str.charAt(i - 1) % 2 != 0 && str.charAt(i) % 2 != 0) {
                sb.append("-");
            }
        }

        sb.append(str.charAt((str.length()-1)));
        return str = sb.toString();
    }
}
