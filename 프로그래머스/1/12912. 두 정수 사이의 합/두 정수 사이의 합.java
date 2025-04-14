class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        answer = (Math.max(a, b) - Math.min(a, b) + 1) * (Math.max(a, b) + Math.min(a, b)) / 2;
        return answer;
    }
}