class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            char word = c;
            int idx = 0;
            while (idx < index) {
                word = word == 'z' ? 'a' : (char) (word + 1);
                if (!skip.contains(String.valueOf(word))) {
                    idx += 1;
                }
            }
            sb.append(word);
        }
        return sb.toString();
    }
}