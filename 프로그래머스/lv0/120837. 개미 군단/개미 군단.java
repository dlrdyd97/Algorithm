class Solution {
    public int solution(int hp) {
        int answer = 0;
        while (hp / 5 > 0) {
			hp -= 5;
			answer++;
		}
		while (hp / 3 > 0) {
			hp -= 3;
			answer++;
		}
		if (hp == 2) {
			answer += 2;
		} else if (hp == 1) {
			answer += 1;
		}
        return answer;
    }
}