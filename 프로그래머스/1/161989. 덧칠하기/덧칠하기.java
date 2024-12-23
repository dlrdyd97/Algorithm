class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        if (section[section.length - 1] - section[0] <= m) {

		} else {
			for (int i = 0; i < section.length - 1; i++) {
				for (int j = i + 1; j < section.length; j++) {
					if (section[j] - section[i] >= m) {
						i = j - 1;
						answer++;
						break;
					}
				}
			}
		}
        return answer;
    }
}