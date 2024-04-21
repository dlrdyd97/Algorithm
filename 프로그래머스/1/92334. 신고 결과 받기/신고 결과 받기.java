import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> hm = new HashMap<>();
        HashMap<String, Integer> idx = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            idx.put(id_list[i], i);
            hm.put(id_list[i], new HashSet<>());
        }

        for (int i = 0; i < report.length; i++) {
            String a = report[i].split(" ")[0]; // 신고자
            String b = report[i].split(" ")[1]; // 피신고자
            hm.get(b).add(a);
        }

        for (String key : hm.keySet()) {
            if (hm.get(key).size() >= k) {
                for (String hsKey : hm.get(key)) {
                    answer[idx.get(hsKey)]++;
                }
            }
        }
        return answer;
    }
}