package 코테22년11월.코테2022_11_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueBoxing {
    public static void main(String[] args) {
        List<Integer> boxes = new ArrayList<>(Arrays.asList(5, 1, 4, 6));
        int output = paveBox(boxes);
        System.out.println(output);
    }
    public static int paveBox(List<Integer> boxes) {
        // TODO:
        ArrayList<Integer> answer = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<>(boxes);

        while (arrayList.size() > 0) {
            for(int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i) > arrayList.get(0)) {
                    answer.add(i);
                    arrayList = arrayList.subList(i , arrayList.size());
                    break;
                }
                if(i == arrayList.size() - 1) {
                    answer.add(arrayList.size());
                    arrayList.clear();
                }
            }
        }
        return answer.stream().max(Integer::compare).orElse(-1);
    }
}
