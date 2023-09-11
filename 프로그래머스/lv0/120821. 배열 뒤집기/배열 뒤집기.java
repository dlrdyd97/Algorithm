import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> fdzz = new ArrayList<>();
		for (int i = 0; i < num_list.length; i++) {
			fdzz.add(num_list[i]);
		}

		Collections.reverse(fdzz);
        return fdzz;
    }
}