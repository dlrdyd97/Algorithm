import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        if (sides[0] + sides[1] > sides[2])
			answer = 1;
		else
			answer = 2;
        return answer;
    }
}