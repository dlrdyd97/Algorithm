class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            String a = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            a = a.substring(16 - n);
            a = a.replace("1", "#");
            a = a.replace("0", " ");
            answer[i] = a;
        }
        return answer;
    }
}