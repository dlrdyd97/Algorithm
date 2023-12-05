import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        String[] fdzz = new String[numbers.length];

        for(int i=0;i<numbers.length;i++){
            fdzz[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(fdzz, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        for(String fd:fdzz){
            sb.append(fd);
        }

        if(sb.charAt(0)=='0'){
            answer = "0";
        }else {
            answer = sb.toString();
        }
        return answer;
    }
}