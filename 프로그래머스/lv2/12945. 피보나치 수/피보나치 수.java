import java.util.ArrayList;

class Solution {
    public int solution(int n) {
         int sum = 0;
        int answer = 0;

        ArrayList<Integer> fdzz = new ArrayList<>();
        fdzz.add(0);
        fdzz.add(1);
        for (int i = 2; i <= n; i++) {
            sum = fdzz.get(i - 2) + fdzz.get(i - 1);
            fdzz.add(sum % 1234567);
        }
        answer = sum % 1234567;
        return answer;
    }
}