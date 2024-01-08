import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String, HashMap<String, Integer>> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>(); // 선물 지수

        for(int i=0;i<friends.length;i++){
            hm1.put(friends[i], new HashMap<>());
            hm2.put(friends[i], 0);
            for(int j=0;j<friends.length;j++){
                if(i==j){
                    continue;
                }
                hm1.get(friends[i]).put(friends[j], 0);
            }
        }

        for(int i=0;i<gifts.length;i++){
            String[] people = gifts[i].split(" ");
            // 선물지수 증가
            hm2.put(people[0], hm2.getOrDefault(people[0], 0) + 1);
            hm2.put(people[1], hm2.getOrDefault(people[1], 0) - 1);
            // A -> B 선물주면 A -> B 증가 , B -> A 감소
            hm1.get(people[0]).put(people[1], hm1.get(people[0]).getOrDefault(people[1], 0) + 1);
            hm1.get(people[1]).put(people[0], hm1.get(people[1]).getOrDefault(people[0], 0) - 1);
        }

        for (String fd : hm1.keySet()) {
            int sum = 0;
            for (int i = 0; i < friends.length; i++) {
                if (fd.equals(friends[i])) {
                    continue;
                }
                if (hm1.get(fd).get(friends[i]) > 0) { // 선물 횟수가 더 많으면
                    sum++;
                }
                if (hm1.get(fd).get(friends[i]) == 0) { // 선물 공유횟수가 같으면
                    if (hm2.get(fd) > hm2.get(friends[i])) {
                        sum++;
                    }
                }
            }
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}