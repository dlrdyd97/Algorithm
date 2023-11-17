import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        int answer = 0;

        // 좌표 저장 방식 = ""  +  (x+y)가 더 적은값  +  (x+y)가 더 큰 값
        HashSet<String> set = new HashSet<>();

        int[] before = {0, 0};
        int[] after = {0, 0};

        for (int i = 0; i < dirs.length(); i++) {

            if (dirs.charAt(i) == 'U') { // 상
                after[1]++;
                if (check(before[0], before[1]) && check(after[0], after[1])) {
                    set.add("" + before[0] + before[1] + after[0] + after[1]);
                }else {
                    after[1]--;
                }

            } else if (dirs.charAt(i) == 'D') { // 하
                after[1]--;
                if (check(before[0], before[1]) && check(after[0], after[1])) {
                    set.add("" + after[0] + after[1] + before[0] + before[1]);
                }else {
                    after[1]++;
                }
            } else if (dirs.charAt(i) == 'L') { // 좌
                after[0]--;
                if (check(before[0], before[1]) && check(after[0], after[1])) {
                    set.add("" + after[0] + after[1] + before[0] + before[1]);
                }else {
                    after[0]++;
                }
            } else {                            // 우
                after[0]++;
                if (check(before[0], before[1]) && check(after[0], after[1])) {
                    set.add("" + before[0] + before[1] + after[0] + after[1]);
                }else {
                    after[0]--;
                }
            }

            before[0] = after[0];
            before[1] = after[1];

        }

        answer = set.size();
        return answer;
    }
    
        static boolean check(int x, int y) {

        if (x < -5 || x > 5 || y < -5 || y > 5) {
            return false;
        }

        return true;
    }
    
}