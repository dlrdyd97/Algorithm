class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder fdzz = new StringBuilder();

		for (int i = 1; i < food.length; i++) {
			for (int j = 0; j < food[i] / 2; j++) {
				fdzz.append(String.valueOf(i));
			}
		}
		answer += fdzz + "0";
		fdzz.reverse();
		answer += fdzz;
        return answer;
    }
}