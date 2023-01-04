package 코테23년01월.코테2023_01_04;

/*문제
2차원 N x N 배열을 시계 방향으로 90도 회전시킨 배열을 리턴해야 합니다.

입력
인자 1 : matrix
가로 길이(matrix[i].length)와 세로 길이(matrix.length)가 모두 N인 2차원 배열
matrix[i][j]는 int 타입
빈 배열일 경우 matrix == null
인자 2 : K
int 타입
배열의 회전 수
출력
2차원 배열을 리턴해야 합니다.
입출력 예시
int[][] matrix = new int[]{
  {1, 2, 3, 4},
  {5, 6, 7, 8},
  {9, 10, 11, 12},
  {13, 14, 15, 16}
}
int K = 1;

System.out.println(matrix[0][0]); // --> 1
System.out.println(matrix[3][2]); // --> 15

int[][] rotatedMatrix = rotateMatrix(matrix, K);
System.out.println(rotatedMatrix[0][0]); // --> 13
System.out.println(rotatedMatrix[3][2]); // --> 8
이때 matrix[i][j]는 '행(세로축)을 기준으로 i만큼 아래에 있고 열(가로축)을 기준으로 j만큼 옆에 있다.`를 뜻합니다. 이 방식은 기하학에서 좌표 평면 위의 한 점을 나타낼 때 (x, y), 즉 가로축을 먼저 표기하고 세로축을 다음에 표기하는 방식과는 다릅니다. 그래프를 인접행렬로 구현할 때, 이 점을 주의하셔야 합니다.

Advanced
세로와 가로의 길이가 각각 M, N인 2차원 M X N 배열을 시계방향으로 90도씩 K번 회전시킨 배열을 리턴해 보세요. 회전수가 두 번째 입력으로 주어집니다.*/

import java.util.List;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 1;

        System.out.println(matrix[0][0]); // --> 1
        System.out.println(matrix[3][2]); // --> 15

        int[][] rotatedMatrix = rotateMatrix(matrix, K);
        System.out.println(rotatedMatrix[0][0]); // --> 13
        System.out.println(rotatedMatrix[3][2]); // --> 8
    }
    public static int[][] rotateMatrix(int[][] matrix, int K) {
        // 필드 변수를 사용하면 테스트가 정상적으로 작동하지 않습니다.
        // 메서드 내부에서 값을 저장하고 활용해주세요.
        // TODO:
//        if (K == 0) {
//            return matrix;
//        } else if(matrix == null) {
//            return null;
//        }
//        int[][] copy = new int[matrix.length][matrix.length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < copy[0].length; j++) {
//                copy[j][i] = matrix[matrix.length - (i+1)][j];
//            }
//        }
//        int[][] result = rotateMatrix(copy, K - 1);
//        return result; 마지막 테스트 실패? 인텔리제이에션 회전수 만큼 잘 돌아감
        if(matrix == null || matrix.length == 0) return matrix;

        int N = matrix.length;
        int M = matrix[0].length;

        int rotateNum = K % 4;
        // 회전하지 않는다.
        if(rotateNum == 0) return matrix;
        // 홀수번 회전 시 M x N, 짝수번 회전 시 N x M
        int[][] rotated = rotateNum % 2 == 1 ? new int[M][N] : new int[N][M];

        for(int row = 0; row < rotated.length; row++) {
            for(int col = 0; col < rotated[row].length; col++) {
                if(rotateNum == 1) {
                    rotated[row][col] = matrix[N - col - 1][row];
                } else if(rotateNum == 2) {
                    rotated[row][col] = matrix[N - row - 1][M - col - 1];
                } else {
                    rotated[row][col] = matrix[col][M - row - 1];
                }
            }
        }
        return rotated;
    }
}
