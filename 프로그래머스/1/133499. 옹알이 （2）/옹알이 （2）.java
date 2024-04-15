import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        String[] pronunciation = { "aya", "ye", "woo", "ma" };
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
			if (babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo")
					|| babbling[i].contains("mama")) {
				continue;
			}

			babbling[i] = babbling[i].replace("aya", " ");
			babbling[i] = babbling[i].replace("ye", " ");
			babbling[i] = babbling[i].replace("woo", " ");
			babbling[i] = babbling[i].replace("ma", " ");
			babbling[i] = babbling[i].replace(" ", "");

			if (babbling[i].length() == 0)
				answer++;
		}
        
        return answer;
    }
}