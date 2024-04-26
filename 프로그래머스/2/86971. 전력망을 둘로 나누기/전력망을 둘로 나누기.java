import java.util.*;

class Solution {
    static int[][] graph;
    
    public int solution(int n, int[][] wires) {
        int answer = n;
        graph = new int[n + 1][n + 1];

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0], b = wires[i][1];
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0], b = wires[i][1];
            graph[a][b] = 0;
            graph[b][a] = 0;

            answer = Math.min(answer, bfs(n, a));
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        return answer;
    }
    
    public static int bfs(int n, int x) {
        boolean[] visited = new boolean[n + 1];
        int cnt = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        visited[x] = true;

        while (!queue.isEmpty()) {
            int check = queue.poll();

            for (int i = 1; i <= n; i++) {
                if (graph[check][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                    cnt++;
                }
            }

        }

        return (int) Math.abs(n - (2 * cnt));
    }
    
}