import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int n) {
        int answer = 0;
		ArrayList<Integer> fdzz = new ArrayList<>();

		while (n >= 3) {
			fdzz.add(n % 3);
			n /= 3;
		}
		fdzz.add(n);
		 Collections.reverse(fdzz);

		for (int i = 0; i < fdzz.size(); i++) {

			answer += fdzz.get(i) * Math.pow(3, i);

		}
        return answer;
    }
}