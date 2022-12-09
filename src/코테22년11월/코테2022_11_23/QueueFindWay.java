package 코테22년11월.코테2022_11_23;

import java.util.Arrays;

public class QueueFindWay {
    public static void main(String[] args) {
        boolean result = getDirections(new int[][]
                        {
                                {0, 1, 0, 0},
                                {0, 0, 1, 0},
                                {0, 0, 0, 1},
                                {0, 1, 0, 0}
                        },
                0,
                2
        );
        System.out.println(result);
    }
//   public boolean getDirections(int[][] matrix, int from, int to) {
//  //   // TODO:
//  //   int num = 0;
//  //     for(int i = 0; i < matrix.length; i++) {
//  //       for(int j = 0; j < matrix[i].length; j++) {
//  //         if(matrix[i][j] == 1 && i == from) {
//  //           if(matrix[i][j] == 1 && j == to) {
//  //             return true;
//  //           } else num = j;
//  //         } else if(matrix[i][j] == 1 && j == to && i == num) {return true;}
//  //       }
//  //     }
//  //   return false;
//	// }
//
    public static boolean getDirections(int[][] matrix, int from, int to) {
    int[][] currentMatrix = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++) currentMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        if(from == to) return true;

        for(int i = 0; i < currentMatrix[from].length; i++) {
        if(currentMatrix[from][i] == 1) {
        currentMatrix[from][i] = 0;
        if(getDirections(currentMatrix, i, to)) return true;
        }
    }
    return false;
    }
}
