package 코테2022_11_25;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvenienceStore {
    public static void main(String[] args) {
        int output1 = partTimeJob(4000);
        System.out.println(output1);
    }
    public static int partTimeJob(int k) {
        // TODO:
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,5,10,50,100,500));
        int count = 0;
        int price = 0;
        for(int i = arr.size() - 1; i >= 0; i--) {
            while(price < k) { price += arr.get(i); count++; }
            if(price > k) { price -= arr.get(i); count--; }
            if(price == k) { break; }
        }
        return count;
    }
}
