import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public double solution(int[] numbers) {
		// double answer = 0;
		// for (int i = 0; i < numbers.length; i++) {
		// 	answer += numbers[i];
		// }
		// answer /= numbers.length;
		// return answer;
        
        IntStream is=Arrays.stream(numbers);
        return is.average().getAsDouble();
        
    }
}