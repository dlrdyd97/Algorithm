import java.util.*;

class Solution {
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;
    static int m;
    static int[] start;
    static int[] end;
    
    public int solution(String[] board) {
        int answer = 0;
        n = board.length;
        m = board[0].length();
        start = new int[2];
        end = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == 'R') {
                    start[0] = i;
                    start[1] = j;
                } else if (board[i].charAt(j) == 'G') {
                    end[0] = i;
                    end[1] = j;
                }
            }
        }

        answer = bfs(board, start, end);
        return answer;
    }
    
    static int bfs(String[] board, int[] start, int[] end) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{
                start[0], start[1], 0});

        boolean[][] visited = new boolean[n][m];
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.peek()[1];
            int cnt = queue.poll()[2];

            if (x == end[0] && y == end[1]) {
                return cnt;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x;
                int ny = y;

                while (inRange(nx, ny) && board[nx].charAt(ny) != 'D') {
                    nx += dx[i];
                    ny += dy[i];
                }

                nx -= dx[i];
                ny -= dy[i];

                if (visited[nx][ny] || (x == nx && y == ny)) {
                    continue;
                }

                visited[nx][ny] = true;
                queue.add(new int[]{nx, ny, cnt + 1});
            }

        }

        return -1;
    }

    static boolean inRange(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < m;
    }
    
}