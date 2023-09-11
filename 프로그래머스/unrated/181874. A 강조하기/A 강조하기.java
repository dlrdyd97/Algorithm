class Solution {
    public String solution(String myString) {
        String answer = "";
       for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'a')
				answer += 'A';
			else if ((int) myString.charAt(i) < 91 && (int) myString.charAt(i) > 64 && (int) myString.charAt(i) != 65)
				answer += (char) ((int) myString.charAt(i) + 32);
			else
				answer += myString.charAt(i);
		}
        return answer;
    }
}