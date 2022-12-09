package 코테22년11월.코테2022_11_24;

public class LetterCapitalize {
    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1);
    }
    public static String letterCapitalize(String str) {
        if(str.length() == 0) return "";
        String result = "";
        String[] words = str.split(" ");
        for(int i = 0; i < words.length;i++){
            if(words[i].isEmpty()) {words[i] = words[i];}
            else words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
        }
        result = String.join(" ",words);
        return result;
    }
}
