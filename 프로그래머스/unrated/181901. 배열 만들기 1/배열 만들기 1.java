import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = k; i <= n; i += k) {
			answer.add(i);
		}
		Collections.sort(answer);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}