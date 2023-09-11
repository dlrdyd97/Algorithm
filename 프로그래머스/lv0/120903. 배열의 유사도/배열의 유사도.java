import java.util.ArrayList;

class Solution {
    public int solution(String[] s1, String[] s2) {
        ArrayList<String> fdzz = new ArrayList<>();
		int answer = 0;

		for (int i = 0; i < s1.length; i++)
			fdzz.add(s1[i]);

		for (int i = 0; i < s2.length; i++) {
			if (fdzz.contains(s2[i]))
				answer++;
		}
        return answer;
    }
}