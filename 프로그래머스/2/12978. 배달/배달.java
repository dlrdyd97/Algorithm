class Solution {
    static final int INF = 500001;
    static boolean[] visited;
    static int[] dist;
    static int[][] map;
    static int cnt = 0;
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        map = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        dist = new int[N + 1];
        visited[1] = true;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i==j) continue;
                map[i][j] = INF;
            }
        }

        for (int i = 0; i < road.length; i++) {
            int a = road[i][0];
            int b = road[i][1];
            int c = road[i][2];

            if (map[a][b] > c) {
                map[a][b] = c;
                map[b][a] = c;
            }
        }

        for (int i = 2; i <= N; i++) {
            dist[i] = INF;
        }

        dijkstra(N, K);

        answer = cnt;
        return answer;
    }
    
    static void dijkstra(int N, int K) {

        for (int i = 1; i < N; i++) {
            int min = INF;
            int idx = 1;

            for (int j = 2; j <= N; j++) {
                if (!visited[j] && min > dist[j]) {
                    idx = j;
                    min = dist[j];
                }
            }

            visited[idx] = true;

            for (int j = 2; j <= N; j++) {
                if (dist[j] > dist[idx] + map[idx][j]) {
                    dist[j] = dist[idx] + map[idx][j];
                }
            }

        }

        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) {
                cnt++;
            }
        }

    }
}