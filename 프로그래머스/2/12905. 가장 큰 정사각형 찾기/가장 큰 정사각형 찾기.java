class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;

        if (board.length < 2 || board[0].length < 2) {
            answer = 1;
        }

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] != 0) {
                    board[i][j] = Math.min(board[i - 1][j - 1], Math.min(board[i - 1][j], board[i][j - 1])) + 1;
                }
                answer = Math.max(answer, board[i][j]);
            }
        }
        return answer * answer;
    }
}