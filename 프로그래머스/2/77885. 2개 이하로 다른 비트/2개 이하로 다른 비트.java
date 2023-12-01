class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        StringBuilder sb;
        int bin = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
                continue;
            }else {
                sb = new StringBuilder(Long.toBinaryString(numbers[i]));
                for (int j = sb.length() - 1; j >= 0; j--) { // 0비트를 찾기
                    if (sb.charAt(j) == '0') {
                        answer[i] = numbers[i] + (long) Math.pow(2, sb.length() - j - 1) - (long) Math.pow(2, sb.length() - j - 2);
                        break;
                    }
                }
            }
            if (answer[i] == 0) {
                answer[i] = numbers[i] + (long) Math.ceil((double) numbers[i]/2);
            }

        }
        return answer;
    }
}