class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        double test1 = 0;
		double test2 = 0;

		for (int i = 1; i <= r2; i++) {

			test1 = (int) Math.ceil(Math.sqrt((Math.pow(r1, 2) - Math.pow(i, 2)))); // Y=i 일때 작은원의 X 좌표
			test2 = (int) Math.floor(Math.sqrt((Math.pow(r2, 2) - Math.pow(i, 2)))); // Y=i 일때 큰원의 X 좌표

			answer += (test2 - test1 + 1);

		}
		answer *= 4;
        return answer;
    }
}