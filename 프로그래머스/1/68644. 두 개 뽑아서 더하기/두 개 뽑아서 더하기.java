import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int i=0; i<numbers.length-1; i++) {
            for (int k=i+1; k<numbers.length; k++) {
                if (!arrayList.contains(numbers[i]+numbers[k])) {
                arrayList.add(numbers[i]+numbers[k]);
                }
            }
        }
            
       Collections.sort(arrayList);
        return arrayList;
    }
}