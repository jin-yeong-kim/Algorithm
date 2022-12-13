package 코테22년12월.코테2022_12_13;

public class DecryptCaesarCipher {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd", 25);
        System.out.println(output);
    }
    public static String decryptCaesarCipher(String str, int secret) {
        // TODO:
        String apb = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                result += " ";
                continue;
            }
            for(int j = 0; j < apb.length(); j++) {
                if(str.charAt(i) == apb.charAt(j)) {
                    if(j - secret < 0) {
                        result += String.valueOf(apb.charAt(apb.length() + (j - secret)));
                        continue;
                    }
                    result += String.valueOf(apb.charAt(j - secret));
                }
            }
        }
        return result;
    }
}
