class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

		for (int i = 0; i < targets.length; i++) {
			for (int j = 0; j < targets[i].length(); j++) {
				int a = 101;
				for (int k = 0; k < keymap.length; k++) {
					if (keymap[k].contains(String.valueOf(targets[i].charAt(j))) == true) {
						a = Math.min(a, keymap[k].indexOf(targets[i].charAt(j)));
					}
				}
				if (a != 101) {
					answer[i] += a + 1;
				} else {
					answer[i] = -1;
					break;
				}
			}
		}
        return answer;
    }
}