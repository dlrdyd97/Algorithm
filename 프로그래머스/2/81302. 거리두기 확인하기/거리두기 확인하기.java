import java.util.LinkedList;
import java.util.Queue;

class Solution {
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1;
        }
        int[] start = new int[2];

        for (int i = 0; i < places.length; i++) {
            loop1:
            for (int j = 0; j < places[i].length; j++) {
                for (int k = 0; k < places[i][j].length(); k++) {
                    if (places[i][j].charAt(k) == 'P') {
                        start[0] = j;
                        start[1] = k;
                        if (!check(places[i], start)) {
                            answer[i] = 0;
                            break loop1;
                        }
                    }
                }
            }
        }
        return answer;
    }
    
    static boolean check(String[] strArr, int[] arr) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{arr[0], arr[1]});

        boolean[][] visited = new boolean[strArr.length][strArr[0].length()];

        while (!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.peek()[1];

            visited[x][y] = true;
            queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= strArr.length || ny < 0 || ny >= strArr[nx].length()) {
                    continue;
                }
                if (!visited[nx][ny]) {
                    int d = Math.abs(nx - arr[0]) + Math.abs(ny - arr[1]);

                    if (d <= 2 && strArr[nx].charAt(ny) == 'O') {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    } else if (d <= 2 && strArr[nx].charAt(ny) == 'P') {
                        return false;
                    }

                }

            }


        }
        return true;
    }
    
}