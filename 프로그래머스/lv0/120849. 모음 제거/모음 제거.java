class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.replaceAll("e", "a");
		my_string = my_string.replaceAll("i", "a");
		my_string = my_string.replaceAll("o", "a");
		my_string = my_string.replaceAll("u", "a");
		answer = my_string.replaceAll("a", "");
        return answer;
    }
}