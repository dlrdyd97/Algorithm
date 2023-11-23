class Solution {
    public int solution(int x, int y, int n) {
        
        int answer = -1;

        int[] dp = new int[y + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1000001;
        }
        dp[x] = 0;

        for (int i = x; i <= y; i++) {
            if (dp[x] == 1000001) {
                continue;
            }
            if (i + n <= y) {
                dp[i + n] = Math.min(dp[i + n], dp[i] + 1);
            }
            if (i * 2 <= y) {
                dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
            }
            if (i * 3 <= y) {
                dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
            }
        }

        if (dp[y] != 1000001) {
            answer = dp[y];
        }
        return answer;
    }
}