class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int sum = 0;

        while (true) {
            answer[sum++] =(int) (n % 10);
            if (n < 10) {
                break;
            }
            n /= 10;
        }
        return answer;
    }
}