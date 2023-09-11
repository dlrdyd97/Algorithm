import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        ArrayList<Integer> fdzz=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            fdzz.add(array[i]);
        }
        
        Collections.sort(fdzz);
        
        answer=fdzz.lastIndexOf(n)-fdzz.indexOf(n)+1;
        return answer;
    }
}