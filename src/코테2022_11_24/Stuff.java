package 코테2022_11_24;

import java.util.Arrays;

public class Stuff {
    public static void main(String[] args) {
        int output = movingStuff(new int[]{42, 25, 60, 73, 103, 167},  187);
        System.out.println(output);
    }
    public static int movingStuff(int[] stuff, int limit) {
        // TODO:
        // 배열을 정렬하고 for에서 i-1과 i suff인덱스를 합친값이 limit보다 크다면 count를 더하고, 인덱스에 0을 채운다.
        int count = 0;
        Arrays.sort(stuff);
        int index = 0;
//        20,30,0,0,0,0  c 5  l 100
        for (int i = stuff.length - 1; i > 0; i--) {
            if(index == i) break;
            if(stuff[index] + stuff[i] <= limit) {
                count++;
                index++;
            }
            if(index == i) break;
        }
        return stuff.length - count;
    }
}
