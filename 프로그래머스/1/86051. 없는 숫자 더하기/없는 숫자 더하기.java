class Solution {
    public int solution(int[] numbers) {
        int[] num = new int[10];
		int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}