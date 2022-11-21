package 코테2022_11_21;

import java.util.*;

public class Stack {
    public static void main(String[] args) {
        int[] boxes = new int[]{1, 5, 7, 9};
        int output = paveBox(boxes);
        System.out.println(output);
    }
    public static int paveBox(int[] boxes) {
        // TODO:
        Queue<Integer> result = new LinkedList<>();
        for(int box : boxes) {result.add(box);}
        int num = result.poll();
        int count = 1;
        for(int person : result){
            if(num > person) count++;
        }
        return count;
    }
}
