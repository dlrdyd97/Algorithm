import java.util.PriorityQueue;

class Solution {

    static boolean[][] visited;
    static int cnt = 0;
    static int[][] numMaps;
    static PriorityQueue<Integer> pq;
    
    public int[] solution(String[] maps) {
        int[] answer = {};
        visited = new boolean[maps.length][maps[0].length()];
        numMaps = new int[maps.length][maps[0].length()];
        pq = new PriorityQueue<>();

        for (int i = 0; i < maps.length; i++) { // 지도 만들기
            for (int j = 0; j < maps[0].length(); j++) {
                if (maps[i].charAt(j) != 'X') {
                    numMaps[i][j] = maps[i].charAt(j) - 48;
                }
            }
        }

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                if (numMaps[i][j] != 0 && !visited[i][j]) {
                    find(i, j);
                    pq.add(cnt);
                    cnt = 0;
                }
            }
        }

        if (pq.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[pq.size()];
            while (!pq.isEmpty()) {
                answer[cnt] = pq.poll();
                cnt++;
            }
        }
        return answer;
    }
    
    static void find(int x, int y) {
        if (x < 0 || x == numMaps.length || y < 0 || y == numMaps[0].length || numMaps[x][y] == 0 || visited[x][y]) {
            return;
        }
        visited[x][y] = true;
        cnt += numMaps[x][y];

        find(x - 1, y);
        find(x + 1, y);
        find(x, y - 1);
        find(x, y + 1);

    }
    
}