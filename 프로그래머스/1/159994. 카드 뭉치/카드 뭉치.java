import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));

        for (String s : goal) {
            if (!q1.isEmpty() && q1.peek().equals(s)) {
                q1.poll();
            } else if (!q2.isEmpty() && q2.peek().equals(s)) {
                q2.poll();
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}