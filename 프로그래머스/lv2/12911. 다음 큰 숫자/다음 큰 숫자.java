class Solution {
    public int solution(int n) {
        int answer = 0;
        // bin = before(이전) 값을 2진으로 변환하고 , 1의 개수 값
		int bin = Integer.bitCount(n);

		while (true) {
			if (bin == Integer.bitCount(++n)) {
				answer = n;
				break;
			}
		}
        return answer;
    }
}