import java.util.*;

class Solution {
    
    static char[][] newBoard ;
    
    static Stack<Integer> stack = new Stack<>();
    
    public int solution(int m, int n, String[] board) {
        
        int answer = 0;
        newBoard = new char[board.length][board[0].length()];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                newBoard[i][j] = board[i].charAt(j);
            }
        }

        while (check()) {
            remove();
            fill();
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                if (newBoard[i][j] == '0') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    static boolean check() {

        for (int i = 0; i < newBoard.length - 1; i++) {

            for (int j = 0; j < newBoard[0].length - 1; j++) {
                // x 좌표 = j   ,   y 좌표 = i
                if (newBoard[i][j] != '0') { // 빈 블록이 아니면
                    if ((newBoard[i][j] == newBoard[i][j + 1])
                            && (newBoard[i][j + 1] == newBoard[i + 1][j])
                                && (newBoard[i + 1][j] == newBoard[i + 1][j + 1])) {
                        stack.add(j);
                        stack.add(i);
                    }
                }
            }
        }

        if(stack.isEmpty()){
            return false;
        }else {
            return true;
        }

    }

    static void remove() {
        while (!stack.isEmpty()) {
            int a = stack.pop();
            int b = stack.pop();

            newBoard[a][b] = '0';
            newBoard[a][b + 1] = '0';
            newBoard[a + 1][b] = '0';
            newBoard[a + 1][b + 1] = '0';

        }
    }

    static void fill() {
        Queue<Character> queue=new LinkedList<>();
        for (int i = 0; i < newBoard[0].length; i++) {
            for (int j = newBoard.length - 1; j >= 0; j--) {
                if(newBoard[j][i]!='0') {
                    queue.add(newBoard[j][i]);
                }
            }
            while (queue.size()!=newBoard.length){
                queue.add('0');
            }
            for (int j = newBoard.length - 1; j >= 0; j--) {
                newBoard[j][i] = queue.poll();
            }
        }

    }
}