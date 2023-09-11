import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(String myString) {
        int cnt = 0;
		ArrayList<Integer> fdzz = new ArrayList<>();
		String[] answer = myString.split("x",-1);
		for (String z : answer) {
			cnt = 0;
			for (int i = 0; i < z.length(); i++) {
				cnt++;
			}
			fdzz.add(cnt);
		}
        return fdzz;
    }
}