import java.util.Arrays;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int[] check = new int[number.length];
        for (int i = 0; i < 10; i++) { // 10개를 먼저 넣고 시작
			for (int j = 0; j < want.length; j++) {
				if (discount[i].equals(want[j])) {
					check[j]++;
					break;
				}
			}
		}
		if (Arrays.equals(number, check)) {
			answer++;
		}

		for (int i = 10; i < discount.length; i++) { // discount 물품이 10개가 넘어가면 추가적으로 진행
			for (int j = 0; j < want.length; j++) { // n번 품목을 넣기전 n-10 품목을 제거
				if (discount[i - 10].equals(want[j])) {
					check[j]--;
					break;
				}
			}

			for (int j = 0; j < want.length; j++) { // n번 품목을 넣음
				if (discount[i].equals(want[j])) {
					check[j]++;
					break;
				}
			}
			if (Arrays.equals(number, check))
				answer++;

		}
        return answer;
    }
}