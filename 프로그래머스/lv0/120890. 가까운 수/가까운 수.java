import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        int check = 101;
		for (int i = 0; i < array.length; i++) {

			if (Math.abs(array[i] - n) < check) {
				answer = array[i];
				check = Math.abs(array[i] - n);
			}
		}
        return answer;
    }
}