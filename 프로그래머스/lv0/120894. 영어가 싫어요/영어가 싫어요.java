class Solution {
    public long solution(String numbers) {
        String[] fdzz = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] fd = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (int i = 0; i < fdzz.length; i++) {
			numbers = numbers.replaceAll(fdzz[i], fd[i]);
		}

		long answer = Long.parseLong(numbers);
        return answer;
    }
}