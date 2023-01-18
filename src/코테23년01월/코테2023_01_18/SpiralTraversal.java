package 코테23년01월.코테2023_01_18;

/*
문제
2차원 M x N 배열을 나선형(spiral)으로 순회해야 합니다.

입력

인자 1 : matrix
세로 길이(matrix.length)가 M, 가로 길이(matrix[i].length)가 N인 2차원 배열
matrix[i]는 Character 타입을 요소로 갖는 배열
matrix[i][j].length는 1

출력
String 타입을 리턴해야 합니다.

주의사항
순회는 좌측 상단 (0,0)에서 시작합니다.
배열의 모든 요소를 순서대로 이어붙인 문자열을 리턴해야 합니다.

입출력 예시
Character[][] matrix = new Character[][]{
  {'A', 'B', 'C'},
  {'D', 'E', 'F'},
  {'G', 'H', 'I'},
};
String output = spiralTraversal(matrix);
System.out.println(output); // --> "ABCFIHGDE"

matrix = new Character[][]{
  {'T', 'y', 'r', 'i'},
  {'i', 's', 't', 'o'},
  {'n', 'r', 'e', 'n'},
  {'n', 'a', 'L', ' '},
};
output = spiralTraversal(matrix);
System.out.println(output); // --> 'Tyrion Lannister'
*/

public class SpiralTraversal {
    public static void main(String[] args) {
        Character[][] matrix = new Character[][]{
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };
        String output = spiralTraversal(matrix);
        System.out.println(output);
    }
    public static String spiralTraversal(Character[][] matrix) {
        // TODO:
        String result = "";
        return spiral(matrix, result);
    }
    public static String spiral(Character[][] matrix, String result) {
        // matrix 의 0번째 인덱스의 값을 전부 result 에 붙여 넣고 matrix 의 0번째 인덱스를 깊은 복사로 제거 한 뒤 배열에 넣어주고,
        // 시계 반대 방향으로 돌린 배열을 다시 깊은 복사로 넣어준 뒤 재귀를 통해 다시 matrix 의 0번 째 인덱스를 result 에 붙여 넣는다.
        // 그렇게 재귀를 통해 반복하여 모든 인덱스의 값을 result 에 붙여 넣게 되면 result 를 반환한다.

        for (int i = 0; i < matrix[0].length; i++) {
            result += matrix[0][i];
        }
        if (matrix.length == 1) return result;
        Character[][] temp = new Character[matrix.length - 1][];
        System.arraycopy(matrix, 1, temp, 0, matrix.length - 1);
        Character[][] subResult = new Character[temp[0].length][temp.length];
        for (int i = 0; i < subResult.length; i++) {
            for (int j = 0; j < subResult[i].length; j++) {
                subResult[i][j] = temp[j][(temp[j].length - 1) - i];
            }
        }
        return spiral(subResult, result);
    }
}
