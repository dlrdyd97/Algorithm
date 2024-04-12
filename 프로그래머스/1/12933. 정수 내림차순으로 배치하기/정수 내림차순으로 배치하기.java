import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);

        answer = Long.parseLong(new StringBuilder(new String(chars)).reverse().toString());
        return answer;
    }
}