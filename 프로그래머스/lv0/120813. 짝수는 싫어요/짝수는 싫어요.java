import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> fdzz = new ArrayList<>();
		for (int i = 1; i <= n; i += 2) {
			fdzz.add(i);
		}
        return fdzz;
    }
}