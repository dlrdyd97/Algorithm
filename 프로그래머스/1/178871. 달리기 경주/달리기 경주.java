import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            hm.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            int front = hm.get(callings[i]);
            int back = front - 1;
            String str = players[front];
            players[front] = players[back];
            players[back] = str;

            hm.put(players[front], front);
            hm.put(players[back], back);
        }

        for (int i = 0; i < players.length; i++) {
            answer[i] = players[i];
        }
        return answer;
    }
}