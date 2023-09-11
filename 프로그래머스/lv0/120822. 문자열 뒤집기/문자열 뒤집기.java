class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder fdzz = new StringBuilder(my_string);
		answer = fdzz.reverse().toString();
        return answer;
    }
}