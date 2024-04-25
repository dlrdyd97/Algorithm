import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> fdzz = new Stack<>();

		for (int i = 0; i < ingredient.length; i++) {
			fdzz.push(ingredient[i]);

			if (fdzz.size() >= 4 && fdzz.get(fdzz.size() - 1) == 1) {

				if ((fdzz.get(fdzz.size() - 2) == 3) && (fdzz.get(fdzz.size() - 3) == 2)
						&& (fdzz.get(fdzz.size() - 4) == 1)) {
					answer++;
					for (int j = 0; j < 4; j++) {
						fdzz.pop();
					}
				}
			}
		}
        return answer;
    }
}