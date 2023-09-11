class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int cnt = 0;

		while (sb.length() < t * m) {
			sb.append(Integer.toString(cnt++, n));
		}

		cnt = p - 1;
		while (sb2.length() != t) {
			sb2.append(sb.charAt(cnt));
			cnt += m;
		}

		answer = sb2.toString().toUpperCase();
        return answer;
    }
}