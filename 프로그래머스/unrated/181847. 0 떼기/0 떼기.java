class Solution {
    public String solution(String n_str) {
        if (n_str.charAt(0) == '0') {
			for (int i = 0; i < n_str.length(); i++) {
				if (n_str.charAt(i) != '0') {
					n_str=n_str.substring(i);
                    break;
				}
			}
		}
        return n_str;
    }
}