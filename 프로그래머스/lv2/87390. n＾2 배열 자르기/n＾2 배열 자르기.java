import java.util.ArrayList;

class Solution {
    public ArrayList<Long> solution(int n, long left, long right) {

        ArrayList<Long> list = new ArrayList<>();

		for (long i = left; i <= right; i++) {
			long a = (i + 1) % n == 0 ? (long) n : (i + 1) % n; // 행렬의 열 값
			long b = (i / n) + 1; // 행렬의 행 값
			list.add(Math.max(a, b));

		}
        return list;
    }
}