package 코테2022_11_25;

import java.util.HashMap;

public class ConvertListToObject {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"some", "like"},
                {"first", "second"},
                {"mike", "ike"},
                {"first", "fox"},
                {"melee", "brawl"},
        };

        HashMap<String, String> output = convertListToHashMap(arr);

        System.out.println(output);
    }
    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:
        HashMap<String,String> result = new HashMap<>();
        if(arr.length == 0 || arr[0].length == 0) return result;
        for(int i = 0; i < arr.length; i++) {
            if(!result.containsKey(arr[i][0])) result.put(arr[i][0],arr[i][1]);
        }
        return result;
    }
}
