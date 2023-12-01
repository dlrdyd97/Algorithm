class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] a = {"aya", "ye", "woo", "ma"};
        for(int i =0; i < babbling.length; i++ ){
           for(int j = 0; j < a.length; j++){ 
                babbling[i] = babbling[i].replace(a[j], "0");
           }
            babbling[i]=babbling[i].replace("0","");
            if(babbling[i].length() == 0){
                answer++;
            }
        }
        return answer;
    }
}