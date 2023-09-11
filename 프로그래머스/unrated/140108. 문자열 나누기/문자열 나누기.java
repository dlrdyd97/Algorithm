class Solution {
    public int solution(String s) {
        int answer = 0;
        int a = 0;
		int b = 0;
		char c = s.charAt(0);

		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				a++;
			} else {
				b++;
			}
			if (a == b) {
				answer++;
				a = 0;
				b = 0;
				if (i < s.length() - 2) {
					c = s.charAt(i + 1);
				}
				continue;
			}
			if (i == s.length() - 1) {
				answer++;
				break;
			}
		}
        return answer;
    }
}