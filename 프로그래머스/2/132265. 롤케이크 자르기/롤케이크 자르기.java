import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        hm1.put(topping[0], 1);
        for(int i=1;i<topping.length;i++){
            hm2.put(topping[i], hm2.getOrDefault(topping[i], 0) + 1);
        }

        for (int i = 1; i < topping.length; i++) {

            hm1.put(topping[i], hm1.getOrDefault(topping[i], 0) + 1);
            if (hm2.get(topping[i]) > 1) {
                hm2.put(topping[i], hm2.getOrDefault(topping[i], hm2.get(topping[i])) - 1);
            }else {
                hm2.remove(topping[i]);
            }
            if (hm1.size() > hm2.size()) {
                break;
            }

            if(hm1.size()==hm2.size()){
                answer++;
            }
        }
        return answer;
    }
}