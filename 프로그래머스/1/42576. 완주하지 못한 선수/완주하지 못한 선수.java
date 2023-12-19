import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String,Integer> fdzz=new HashMap<>();
        for(String p:participant)
            fdzz.put(p,fdzz.getOrDefault(p,0)+1);
        for(String c:completion)
            fdzz.put(c,fdzz.get(c)-1);
        for(String fd:fdzz.keySet()){
            if(fdzz.get(fd)==1){
                answer=fd;
                break;
            }
        }
        
        return answer;
    }
}