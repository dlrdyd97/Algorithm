import java.util.ArrayList;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        ArrayList<String> fdzz = new ArrayList<>();
		for (int i = 0; i < my_string.length() / m; i++) {
			fdzz.add(my_string.substring(i * m, (i + 1) * m));
		}
		for (String fd : fdzz) {
			answer += fd.charAt(c - 1);
		}
        return answer;
    }
}