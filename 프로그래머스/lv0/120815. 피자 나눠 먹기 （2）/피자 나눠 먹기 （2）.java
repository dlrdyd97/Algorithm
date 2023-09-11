class Solution {
    public int solution(int n) {
        int answer = 1;
        int t=6;
        while(t%n!=0){
            answer++;
            t+=6;
        }
        return answer;
    }
}