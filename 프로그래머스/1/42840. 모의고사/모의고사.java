import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] mathGaveUp = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) {
                mathGaveUp[0]++;
            }
            if (answers[i] == b[i % 8]) {
                mathGaveUp[1]++;
            }
            if (answers[i] == c[i % 10]) {
                mathGaveUp[2]++;
            }
        }

        int num = Math.max(Math.max(mathGaveUp[0], mathGaveUp[1]), mathGaveUp[2]);


        for (int i = 0; i < 3; i++) {
            if (mathGaveUp[i] == num)
                arrayList.add(i+1);
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
}