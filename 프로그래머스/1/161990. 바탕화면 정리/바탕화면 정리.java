import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String[] wallpaper) {
        ArrayList<Integer> fdzz = new ArrayList<>();

		int[] answer = new int[4];
		for (int i = 0; i < 4; i++) {
			answer[i]--;
		}

		for (int i = 0; i < wallpaper.length; i++) {
			if (wallpaper[i].contains("#")) {
				fdzz.add(wallpaper[i].indexOf("#"));
				fdzz.add(wallpaper[i].lastIndexOf("#"));
				if (answer[0] == -1) { // 높이
					for (int j = wallpaper.length - 1; j >= i; j--) {
						if (wallpaper[j].contains("#")) {
							answer[0] = i;
							answer[2] = j + 1;
							break;
						}
					}
				}

			}
		}

		Collections.sort(fdzz);
		answer[1] = fdzz.get(0);
		answer[3] = fdzz.get(fdzz.size() - 1) + 1;
        return answer;
    }
}