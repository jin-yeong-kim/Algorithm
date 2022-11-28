package 코테2022_11_28;

import java.util.ArrayList;

public class BlackJack {
    public static void main(String[] args) {
        int output = boringBlackjack(new int[]{1, 2, 3, 4});
        System.out.println(output);
    }
    public static int boringBlackjack(int[] cards) {
        // TODO:
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < cards.length; i++) {
            for(int j = i + 1; j < cards.length; j++) {
                for(int k = j + 1; k < cards.length; k++) {
                    arr.add(cards[i] + cards[j] + cards[k]);
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            int count = 0;
            for(int j = 2; j <= (int)Math.sqrt(arr.get(i)); j++) {
                if(arr.get(i) % j == 0) {
                    count++;
                }
            }
            if(count == 0) {
                result++;
            }
        }
        return result;
    }
}
