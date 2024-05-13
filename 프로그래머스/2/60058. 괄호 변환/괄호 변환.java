class Solution {
    public String solution(String p) {
        if (checkString(p)) {
            return p;
        }else {
            return dfs(p);
        }
    }
    
    static String dfs(String s) {

        // 1
        if (s.length() == 0) {
            return s;
        }

        // 2
        String u = "", v = "";
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt == 0) {
                u = s.substring(0, i + 1);
                v = s.substring(i + 1);
                break;
            }
        }

        // 3
        if (checkString(u)) { // 3 -> 3-1
            return u + dfs(v);
        } else { // 3 -> 4
            String str = "(" + dfs(v) + ")";
            u = u.substring(1, u.length() - 1);
            u = u.replace("(", "[");
            u = u.replace(")", "(");
            u = u.replace("[", ")");
            str += u;
            return str;
        }

    }

    static boolean checkString(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt < 0) {
                return false;
            }
        }

        return true;
    }
    
}