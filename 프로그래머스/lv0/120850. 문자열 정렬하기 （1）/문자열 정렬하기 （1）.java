import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> fdzz = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i++) {
			if ((int) my_string.charAt(i) < 65)
				fdzz.add(Character.getNumericValue(my_string.charAt(i)));
		}
		Collections.sort(fdzz);
        return fdzz;
    }
}