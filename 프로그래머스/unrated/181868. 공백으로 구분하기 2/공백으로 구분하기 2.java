import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> fdzz = new ArrayList<>();
        String[] fd = my_string.split(" +");
		for (String z : fd) {
			if (!z.isEmpty())
				fdzz.add(z);
		}
        return fdzz;
    }
}