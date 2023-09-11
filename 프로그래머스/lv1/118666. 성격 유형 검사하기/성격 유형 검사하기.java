class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] fdzz = new int[8];
		String[] fdzz2 = { "R", "T", "C", "F", "J", "M", "A", "N" };
		String answer = "";

		for (int i = 0; i < survey.length; i++) {
			if (choices[i] > 4) {
				char a = survey[i].charAt(1);
				fdzz[calcu(a)] += choices[i] - 4;
			} else if (choices[i] < 4) {
				char a = survey[i].charAt(0);
				fdzz[calcu(a)] += 4 - choices[i];
			}
		}

		for (int i = 0; i < 4; i++) {
			if (fdzz[i * 2] >= fdzz[i * 2 + 1]) {
				answer += fdzz2[i * 2];
			} else {
				answer += fdzz2[i * 2 + 1];
			}
		}
        return answer;
    }
    
    static int calcu(char a) {
		if (a == 'R') {
			return 0;
		} else if (a == 'T') {
			return 1;
		} else if (a == 'C') {
			return 2;
		} else if (a == 'F') {
			return 3;
		} else if (a == 'J') {
			return 4;
		} else if (a == 'M') {
			return 5;
		} else if (a == 'A') {
			return 6;
		} else if (a == 'N') {
			return 7;
		}

		return 0;
	}
}