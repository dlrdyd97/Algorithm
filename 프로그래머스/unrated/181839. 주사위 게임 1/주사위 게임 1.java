class Solution {
    public int solution(int a, int b) {
        int c = a % 2 + b % 2;
		int answer = 0;

		if (c == 2) {
			answer = a * a + b * b;
		} else if (c == 1) {
			answer = 2 * (a + b);
		} else {
			answer = Math.abs(a - b);
		}
        return answer;
    }
}