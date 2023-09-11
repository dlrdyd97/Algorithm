import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] answer = new int[3];
		ArrayList<Integer> fdzz = new ArrayList<>();

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == a[i % 5]) {
				answer[0]++;
			}
            if (answers[i] == b[i % 8]) {
				answer[1]++;
			}
            if (answers[i] == c[i % 10]) {
				answer[2]++;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (answer[i] == Math.max(Math.max(answer[0], answer[1]), answer[2]))
				fdzz.add(i+1);
		}
        
        return fdzz.stream().mapToInt(i->i).toArray();
    }
}