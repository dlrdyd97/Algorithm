import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> fdzz = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				fdzz.add(i);
		}
		answer = fdzz.size();
        return answer;
    }
}