import java.util.ArrayList;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        long factorial = 1;
        int index = 0;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            arrayList.add(i);
        }

        k--;
        for (int i = 0; i < answer.length; i++) {
            factorial /= (n - i);
            int num = (int) (k / factorial);
            answer[i] = arrayList.get(num);
            arrayList.remove(num);
            k %= factorial;
        }
        return answer;
    }
}