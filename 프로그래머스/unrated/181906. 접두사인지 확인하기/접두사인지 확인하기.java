import java.util.ArrayList;
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        ArrayList<String> fdzz = new ArrayList<>();
        StringBuilder sb = new StringBuilder(my_string);
        for (int i = 1; i < my_string.length() + 1; i++) {
			fdzz.add(sb.substring(0, i));
		}
        
        return fdzz.indexOf(is_prefix)!=-1?1:0;
    }
}