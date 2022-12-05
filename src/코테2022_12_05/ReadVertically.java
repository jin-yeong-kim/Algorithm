package 코테2022_12_05;

public class ReadVertically {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output);
    }
    public static String readVertically(String[] arr) {
        // TODO:
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].length()) max = arr[i].length();
        }
        String[] temp = new String[max];
        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];
            for(int j = 0; j < str.length(); j++) {
                if(temp[j] == null) {
                    temp[j] = Character.toString(str.charAt(j));
                } else {
                    temp[j] = temp[j] + str.charAt(j);
                }
            }
        }
        String result = "";
        for(int i = 0; i < temp.length; i++) {
            result += temp[i];
        }
        return result;
    }
}
