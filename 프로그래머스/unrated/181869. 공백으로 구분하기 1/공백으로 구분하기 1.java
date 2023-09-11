import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> fdzz = new ArrayList<>();
		while (my_string.indexOf(" ") != -1) {
			fdzz.add(my_string.substring(0, my_string.indexOf(" ")));
			my_string = my_string.substring(my_string.indexOf(" ") + 1);
		}
		fdzz.add(my_string);
        return fdzz;
    }
}