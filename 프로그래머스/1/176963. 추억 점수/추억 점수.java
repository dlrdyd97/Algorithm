import java.util.ArrayList;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

		for (int i = 0; i < photo.length; i++) {
			ArrayList<String> fdzz = new ArrayList<>();
			for (int j = 0; j < photo[i].length; j++) {
				fdzz.add(photo[i][j]);
			}
			for (int j = 0; j < name.length; j++) {
				if (fdzz.contains(name[j])) {
					answer[i] += yearning[j];
				}
			}
		}
        return answer;
    }
}