import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        int max = 0;
        int answer = 0;
        int[][] board = new int[park.length][park[0].length];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                if (park[i][j].equals("-1")) {
                    board[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {
                if (board[i][j] != 0) {
                    board[i][j] = Math.min(board[i - 1][j - 1], Math.min(board[i - 1][j], board[i][j - 1])) + 1;
                }
                max = Math.max(max, board[i][j]);
            }
        }

        for (int i : mats) {
            if (i <= max) {
                answer = i;
            }
        }
        if (answer == 0) {
            answer = -1;
        }
        return answer;
    }
}