class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3];
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            if (48 <= dartResult.charAt(i) && dartResult.charAt(i) <= 57) {
                sb.append(dartResult.charAt(i));
            } else if (65 <= dartResult.charAt(i)) {
                arr[cnt++] = cal(Integer.parseInt(sb.toString()), dartResult.charAt(i));
                sb.setLength(0);
            } else {
                if (dartResult.charAt(i) == '*') {
                    if (cnt == 1) {
                        arr[cnt - 1] = arr[cnt - 1] * 2;
                    } else {
                        arr[cnt - 1] = arr[cnt - 1] * 2;
                        arr[cnt - 2] = arr[cnt - 2] * 2;
                    }
                } else {
                    arr[cnt - 1] = -arr[cnt - 1];
                }
            }
        }
        for (int num : arr) {
            answer += num;
        }
        return answer;
    }
    
    static int cal(int a,char b) {
        if (b == 'S') {
            return a;
        } else if (b == 'D') {
            return a * a;
        } else {
            return a * a * a;
        }
    }
}