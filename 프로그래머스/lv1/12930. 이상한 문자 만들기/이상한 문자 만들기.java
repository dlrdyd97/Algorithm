class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ",-1);
        String answer = "";

        StringBuilder fdzz = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            String big = arr[i].toUpperCase();
            String small = arr[i].toLowerCase();
            for (int j = 0; j < arr[i].length(); j++) {
                if (j % 2 == 0) {
                    fdzz.append(big.charAt(j));
                } else {
                    fdzz.append(small.charAt(j));
                }
            }
            if (i != arr.length - 1)
                fdzz.append(" ");
        }
        answer = fdzz.toString();
        return answer;
    }
}