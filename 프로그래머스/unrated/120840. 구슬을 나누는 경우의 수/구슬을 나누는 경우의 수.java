class Solution {
    public int solution(double balls, double share) {
        double answer = 1;

		for (double i = balls; i > balls - share; i--) {
			Math.round(answer *= i);
		}

		for (double i = 1; i <= share; i++) {
			Math.round(answer /= i);
		}
        
        return (int)Math.round(answer);
    }
}