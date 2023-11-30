import java.util.*;

class Solution {
    public int solution(int[] order) {
        Queue<Integer> firstCon = new LinkedList<>();
        Stack<Integer> secondCon = new Stack<>();
        int answer = 0;

        for (int i = 1; i < order[0]; i++) {
            secondCon.add(i);
        }

        for(int i=order[0];i<=order.length;i++){
            firstCon.add(i);
        }

        while (!firstCon.isEmpty() || !secondCon.isEmpty()) {

            if (!firstCon.isEmpty() && firstCon.peek() == order[answer]) {
                firstCon.poll();
                answer++;
            } else if (!secondCon.isEmpty() && secondCon.peek() == order[answer]) {
                secondCon.pop();
                answer++;
            }

            if (!firstCon.isEmpty()) { // 주 컨베이어 벨트에 상자가 있으면
                if (firstCon.peek() != order[answer]) { // 상자는 있지만 순서가 맞지 않으면
                    if(secondCon.isEmpty()){
                        secondCon.add(firstCon.poll());
                    } else if (!secondCon.isEmpty() && secondCon.peek() != order[answer]) {
                        secondCon.add(firstCon.poll());
                    }
                }

            } else { // 주 컨베이어 벨트에 상자가 없으면
                if (secondCon.isEmpty()) { // 보조 컨베이어 벨트도 비어있으면
                    break;
                } else if (!secondCon.isEmpty() && secondCon.peek() != order[answer]) {
                    // 보조 컨베이어 벨트에 상자가 있지만 순서가 맞지 않으면
                    break;
                }
            }
            
        }
        
        return answer;
    }
}