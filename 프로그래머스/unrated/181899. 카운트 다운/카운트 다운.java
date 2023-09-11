import java.util.ArrayList;

class Solution {
    public int[] solution(int start, int end_num) {
         ArrayList<Integer> fdzz = new ArrayList<>();
        for (int i = start; i >= end_num; i--) {
            fdzz.add(i);
        }
        return fdzz.stream().mapToInt(i -> i).toArray();
    }
}