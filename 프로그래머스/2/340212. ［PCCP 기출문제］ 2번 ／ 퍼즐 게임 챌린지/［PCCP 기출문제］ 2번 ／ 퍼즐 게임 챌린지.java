class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int start = 1;
        int end = 100000;

        while (start <= end) {
            int level = (start + end) / 2;
            long totalTime = calTime(diffs, times, level);

            if (totalTime <= limit) { // 제한시간보다 소요시간이 적으면
                answer = level;
                end = level - 1;
            } else { // 제한시간보다 소요시간이 많으면
                start = level + 1;
            }
        }
        return answer;
    }

    static long calTime(int[] diffs, int[] times, int level) {
        long totalTime = times[0];

        for (int i = 1; i < diffs.length; i++) {
            int calc = diffs[i] - level;

            if (calc <= 0) { // 나의 수준이 퍼즐의 난이도보다 높다면
                totalTime += times[i];
                continue;
            }
            totalTime += (times[i] + times[i - 1]) * calc + times[i];
        }

        return totalTime;
    }
    
}