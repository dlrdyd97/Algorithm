import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<Character> fdzz = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i++)
			fdzz.add(my_string.toLowerCase().charAt(i));
		Collections.sort(fdzz);

		for (int i = 0; i < fdzz.size(); i++)
			answer += fdzz.get(i);
        return answer;
    }
}