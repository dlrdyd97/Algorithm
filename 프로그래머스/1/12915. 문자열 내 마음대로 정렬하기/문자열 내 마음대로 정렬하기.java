import java.util.PriorityQueue;

class Solution {
    public String[] solution(String[] strings, int n) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        for (String s : strings) {
            pq.add(s.charAt(n) + s);
        }

        int cnt = 0;
        while (!pq.isEmpty()) {
            strings[cnt] = pq.poll().substring(1);
            cnt++;
        }
        return strings;
    }
}