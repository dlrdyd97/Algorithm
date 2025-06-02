import java.util.*;

class Solution {
    
    List<int[]> arrayList = new ArrayList<>();
    
    public int[][] solution(int n) {
        
        hanoi(1,2,3,n);

        int[][] answer = arrayList.toArray(int[][]::new);
        
        return answer;
    }
  
    void hanoi(int from,int to,int via,int num){
        if (num == 0) {
            return;
        }
        hanoi(from, via, to, num - 1);
        arrayList.add(new int[]{from, via});
        hanoi(to, from, via, num - 1);
    }
}