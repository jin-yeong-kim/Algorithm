package 코테22년11월.코테2022_11_04;

public class makeMarginalString {
    public String makeMarginalString(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                result = result + str.charAt(j);
            }
        }

        return result;
    }
}
