package 코테2022_11_27;

import java.util.ArrayList;
import java.util.Arrays;

public class RockPaperScissors {
    public static void main(String[] args) {
        ArrayList<String[]> output = rockPaperScissors(5);
        System.out.println(output);
    }
    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        ArrayList<String[]> result = new ArrayList<>();
        return dfs(rounds, new String[]{}, result);
    }

    public static ArrayList<String[]> dfs(int depth, String[] oneDimention, ArrayList<String[]> result) {
        // rounds가 0일 경우 outcones 배열에 삽입하고, 재귀에서 빠져나옵니다.
        if(depth == 0) {
            result.add(oneDimention);
            return result;
        }

        String[] rps = new String[]{"rock", "paper", "scissors"};

        for(int i = 0; i < rps.length; i++) {
            String index = rps[i];
            String[] dimention = Arrays.copyOf(oneDimention, oneDimention.length + 1);
            dimention[dimention.length - 1] = index;
            result = dfs(depth - 1, dimention, result);
        }

        // outcomes를 반환합니다.
        return result;
    }
}
