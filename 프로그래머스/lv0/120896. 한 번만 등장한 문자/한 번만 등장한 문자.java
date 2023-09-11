import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
       ArrayList<String> fdzz = new ArrayList<>();
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                fdzz.add(Character.toString(s.charAt(i)));
            }
        }

        Collections.sort(fdzz);
        for (int i = 0; i < fdzz.size(); i++) {
            answer += fdzz.get(i);
        }
        return answer;
    }
}