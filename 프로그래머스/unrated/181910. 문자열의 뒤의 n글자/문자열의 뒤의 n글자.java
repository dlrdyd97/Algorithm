class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
		answer = sb.substring(my_string.length() - n);
        return answer;
    }
}