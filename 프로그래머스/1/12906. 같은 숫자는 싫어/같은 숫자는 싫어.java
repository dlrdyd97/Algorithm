import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int zz : arr) {
            if (stack.isEmpty() || stack.peek() != zz) {
                stack.push(zz);
            }
        }
        return stack;
    }
}