import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer> ls = new ArrayList<>(); // 잃어버린 학생
        ArrayList<Integer> rs = new ArrayList<>(); // 여벌이 있는 학생

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            ls.add(lost[i]);
        }

        for (int i = 0; i < reserve.length; i++) {
            rs.add(reserve[i]);
        }

        for (int i = 0; i < ls.size(); i++) { // 여벌 체육복을 가져온 학생이 체육복을 도난당했을경우
            for (int j = 0; j < rs.size(); j++) {
                if (ls.get(i) == rs.get(j)) { // ls,rs에서 모두 제거
                    ls.remove(i);
                    rs.remove(j);
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < ls.size(); i++) { // 잃어버린 학생이 빌릴 수 있는지 확인
            int front = rs.indexOf(ls.get(i) - 1); // 잃어버린 학생의 앞 번호
            if (front != -1) { // 앞 번호 학생에게 빌릴 수 있으면
                ls.remove(i);
                rs.remove(front);
                i--;
                continue;
            }
            int back = rs.indexOf(ls.get(i) + 1); // 잃어버린 학생의 뒷 번호
            if (back != -1) { // 뒷 번호 학생만 존재하면
                ls.remove(i);
                rs.remove(back);
                i--;
            }
        }

        answer = n - ls.size();
        return answer;
    }
}