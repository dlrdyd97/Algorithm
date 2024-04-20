import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
		HashMap<String, HashSet<String>> map = new HashMap<>();
		HashMap<String, Integer> idx = new HashMap<>();

		for (int i = 0; i < id_list.length; i++) {
			String name = id_list[i];
			map.put(name, new HashSet<>());
			idx.put(name, i);
		}

		for (int i = 0; i < report.length; i++) {
			String[] spl = report[i].split(" ");
			String A = spl[0];
			String B = spl[1];
			map.get(B).add(A);
		}

		for (int i = 0; i < map.size(); i++) {
			if (map.get(id_list[i]).size() >= k) {
				for (String name : map.get(id_list[i])) {
					answer[idx.get(name)]++;
				}
			}
		}
        return answer;
    }
}