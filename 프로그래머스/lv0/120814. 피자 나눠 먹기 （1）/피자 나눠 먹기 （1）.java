class Solution {
    public int solution(int n) {
        int answer = 1;
        int t=7;
        while(t/n<1){
            answer++;
            t+=7;
        }
        return answer;
    }
}