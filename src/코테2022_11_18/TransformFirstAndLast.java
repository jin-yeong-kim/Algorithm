package 코테2022_11_18;

import java.util.HashMap;

public class TransformFirstAndLast {
    public static void main(String[] args) {
        String[] arr = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
        HashMap<String, String> output = transformFirstAndLast(arr);
        System.out.println(output); // --> { Queen : 'Beyonce' }
    }
    public static HashMap<String, String> transformFirstAndLast(String[] arr) {
        // TODO:
        // 빈 배열의 경우 null을 리턴한다.
        // 해시맵을 생성한다.
        // 해시맵의 키값엔  arr의 첫번째 인덱스, value에는 마지막 인덱스를 넣은 뒤 리턴한다.
        if(arr.length == 0) return null;
        HashMap<String, String> output = new HashMap<>();
        output.put(arr[0],arr[arr.length-1]);
        return output;
    }
}
