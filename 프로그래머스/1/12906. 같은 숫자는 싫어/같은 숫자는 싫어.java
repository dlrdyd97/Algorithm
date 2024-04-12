import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (stack.peek() == arr[i]) {
                continue;
            } else {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        int sum = 0;
        while (!stack.isEmpty()) {
            answer[sum++] = stack.pop();
        }
        return answer;
    }
}