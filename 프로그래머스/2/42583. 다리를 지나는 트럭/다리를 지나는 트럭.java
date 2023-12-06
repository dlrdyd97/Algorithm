import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
int answer = 0;
        int sumWeight = 0;
        int currentTruck = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i : truck_weights) {
            currentTruck = i;

            while (true) {
                if (queue.isEmpty()) { // 다리에 트럭이 없으면 트럭 추가
                    queue.add(currentTruck);
                    sumWeight += currentTruck;
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) { // 다리에 트럭이 꽉차있으면
                    sumWeight -= queue.poll();
                } else { // 트럭이 다리에 진입하기위해 무게 비교
                    if (sumWeight + currentTruck > weight) { // 무게 초과면
                        queue.add(0);
                        answer++;
                    }else{ // 트럭이 다리에 진입이 가능하면
                        queue.add(i);
                        sumWeight += i;
                        answer++;
                        break;
                    }
                }
            }


        }

        answer += bridge_length;
        return answer;
    }
}