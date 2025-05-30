class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        
        int[] serversArr = new int[players.length + k];
        int servers = 0;

        for (int i = 0; i < players.length; i++) {
            int a = players[i] / m;
            servers -= serversArr[i];

            if (a != 0) {
                if (servers < a) {
                    serversArr[i + k] += a - servers;
                    answer += (a - servers);
                    servers = a;
                }
            }

        }
        return answer;
    }
}