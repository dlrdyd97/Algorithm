import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        if (nums.length / 2 < hs.size()) {
            answer = nums.length / 2;
        } else {
            answer = hs.size();
        }
        return answer;
    }
}