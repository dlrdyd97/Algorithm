import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        
        Stack<Character> fdzz=new Stack<>();
        fdzz.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(fdzz.size()==0){
                fdzz.push(s.charAt(i));
            }else{
                if(fdzz.peek()==s.charAt(i)){
                    fdzz.pop();
                }   else{
                fdzz.push(s.charAt(i));
                }
            }
        }
    
        if(fdzz.size()==0){
            answer=1;
        }else{
            answer=0;
        }

        return answer;
    }
}