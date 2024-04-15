import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stg = new int[N];
        double[] fail1 = new double[N];
        double[] fail2 = new double[N];
        int sum = stages.length;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] > N) {
                continue;
            }
            stg[stages[i] - 1]++;
        }
        for (int i = 0; i < stg.length; i++) {
            if (sum == 0) {
                continue;
            }
            fail1[i] = (double) stg[i] / sum;
            fail2[i] = (double) stg[i] / sum;
            sum -= stg[i];
        }
        Arrays.sort(fail1);
        N = 0;
        for (int i = fail1.length - 1; i >= 0; i--) {
            for (int j = 0; j < fail1.length; j++) {
                if (fail1[i] == fail2[j]) {
                    fail2[j] = -1;
                    answer[N++] = j + 1;
                }
            }
        }
        return answer;
    }
}