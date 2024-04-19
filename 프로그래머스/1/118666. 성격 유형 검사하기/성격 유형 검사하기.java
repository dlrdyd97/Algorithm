import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        String[] strArr = {"R", "T", "C", "F", "J", "M", "A", "N"};

        for (int i = 0; i < strArr.length; i++) {
            hm.put(strArr[i], 0);
        }

        for (int i = 0; i < survey.length; i++) {
            String a = String.valueOf(survey[i].charAt(choices[i] / 4));
            if (choices[i] != 4) {
                hm.put(a, hm.get(a) + Math.abs(4 - choices[i]));
            }
        }

        for (int i = 0; i < strArr.length; i += 2) {
            int a = hm.get(strArr[i]);
            int b = hm.get(strArr[i + 1]);
            if (a >= b) {
                answer += strArr[i];
            } else if (b > a) {
                answer += strArr[i + 1];
            }
        }
        return answer;
    }
}