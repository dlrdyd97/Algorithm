import java.util.LinkedList;
import java.util.Queue;

class Solution {
    
    static int[][] numberMap;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(String[] maps) {
        int answer = -1;
        numberMap = new int[maps.length][maps[0].length()];

        int[] start = new int[2];
        int[] lever = new int[2];

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                if (maps[i].charAt(j) == 'S') {
                    numberMap[i][j] = 2; // 시작 지점은 2
                    start[0] = i;
                    start[1] = j;
                } else if (maps[i].charAt(j) == 'E') {
                    numberMap[i][j] = 3; // 도착 지점은 3
                } else if (maps[i].charAt(j) == 'L') {
                    numberMap[i][j] = 4; // 레버 지점은 4
                    lever[0] = i;
                    lever[1] = j;
                } else if (maps[i].charAt(j) == 'O') {
                    numberMap[i][j] = 1; // 지나갈 수 있는 길은 1 , 막혀있는 길은 0
                }
            }
        }

        int startToLever = bfs(start, 4);
        int leverToEnd = bfs(lever, 3);

        if (startToLever != -1 && leverToEnd != -1) {
            answer = startToLever + leverToEnd;
        }
        return answer;
    }
    
    static int bfs(int[] arr, int target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{arr[0], arr[1], 0});

        boolean[][] visited = new boolean[numberMap.length][numberMap[0].length];

        while (!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.peek()[1];
            int cnt = queue.peek()[2];
            visited[x][y] = true;

            if (numberMap[x][y] == target) {
                return cnt;
            }

            queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < numberMap.length && ny >= 0 && ny < numberMap[0].length && !visited[nx][ny]) {
                    if (numberMap[nx][ny] != 0) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny, cnt + 1});
                    }
                }
            }

        }

        return -1;
    }
    
}