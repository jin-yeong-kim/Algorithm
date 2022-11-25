package 코테2022_11_25;

public class BoardGame {
    public static void main(String[] args) {
        int[][] board1 = new int[][]{
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };
        int output1 = boardGame(board1, "RRDLLD");
        System.out.println(output1);
    }
    public static Integer boardGame(int[][] board, String operation) {
        // TODO:
        // count변수를 생성 및 초기화를 하고, 얻은 점수의 합산을 count에 저장한다.
        // operation을 for문으로 순회하면서, charAt(i)를 사용하여 각 글자의 위치에 맞게 board의 인덱스를 벗어나지 않고, player의 위치를 U, D, L, R에 맞게 1을 더하거나 뺀다.
        // ( if문으로 player의 인덱스가 board의 인덱스 크기를 벗어나면 null을 반환한다. )
        // 배열을 이동하고 0, 1 중 1이 나오면 count에 1을 더하고,
        // 마지막으로 operation을 전부 순회했다면, count를 리턴한다.
        int count = 0;
        int[] player = new int[]{0, 0};
        for(int i = 0; i < operation.length(); i++) {
            if(operation.charAt(i) == 'U') {
                player[0] -= 1;
                if(0 > player[0]) return null;
                if(board[player[0]][player[1]] == 1) count++;
            }
            else if(operation.charAt(i) == 'D') {
                player[0] += 1;
                if(board.length - 1 < player[0]) return null;
                if(board[player[0]][player[1]] == 1) count++;
            }
            else if(operation.charAt(i) == 'L') {
                player[1] -= 1;
                if(0 > player[0]) return null;
                if(board[player[0]][player[1]] == 1) count++;
            }
            else if(operation.charAt(i) == 'R') {
                player[1] += 1;
                if(board[0].length - 1 < player[0]) return null;
                if(board[player[0]][player[1]] == 1) count++;
            }
        }
        return count;
    }
}
