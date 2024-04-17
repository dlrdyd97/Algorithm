import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = 0;
        int[] arr = new int[n + 2];
        HashSet<Integer> hs = new HashSet<>();
        for (int num : lost) {
            hs.add(num);
        }
        for (int num : reserve) {
            hs.add(num);
        }
        answer = n + reserve.length - hs.size();

        for (int i = 0; i < lost.length; i++) {
            arr[lost[i]]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            arr[reserve[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (arr[i] == -1) {
                if (arr[i - 1] == 1) {
                    answer++;
                } else if (arr[i + 1] == 1) {
                    answer++;
                    arr[i + 1] = 0;
                }
            }
        }
        return answer;
    }
}