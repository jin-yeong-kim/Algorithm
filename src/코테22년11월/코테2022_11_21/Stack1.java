package 코테22년11월.코테2022_11_21;

import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        int[] boxes = new int[]{5, 1, 4,1, 4,1, 4,1, 4,1, 4,1, 4,1, 4,1, 4,1, 4,1, 4,1, 4,1, 4};
        int output = paveBox(boxes);
        System.out.println(output);
    }
    public static int paveBox(int[] boxes) {
        // TODO:
        Queue<Integer> result = new LinkedList<>();
        for (int box : boxes) {
            result.add(box);
        }
        int num = result.poll();
        int count = 1;
        for (int person : result) {
            if (num >= person) {
                count++;
            } else if (num < person) break;
        }
        return count;
    }
}
