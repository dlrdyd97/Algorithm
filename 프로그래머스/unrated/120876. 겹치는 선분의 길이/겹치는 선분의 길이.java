class Solution {
    public int solution(int[][] lines) {
        int[] fdzz = new int[200];
		int answer = 0;
		for (int i = 0; i < lines.length; i++) {
			for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
				fdzz[j]++;
			}
		}

		for (int i = 0; i < 200; i++) {
			if (fdzz[i] > 1)
				answer++;
		}
        return answer;
    }
}