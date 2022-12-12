package 코테22년12월.코테2022_12_12;

public class NumberSearch {
    public static void main(String[] args) {
        int output = numberSearch("YlQO uT9");
        System.out.println(output);
    }
    public static int numberSearch(String str) {
        // TODO:
        if(str.length() == 0) return 0;
        double count = 0;
        double sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
                sum += (int)str.charAt(i) - 48;
            } else if (str.charAt(i) == ' ') {
                count++;
            }
        }
        double result = sum / (str.length() - count);
        System.out.println(result);
        return (int) Math.round(result);
    }
}
