import java.util.PriorityQueue;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : enemy) {
            if (k > 0) {
                k--;
                pq.offer(num);
            } else {
                int a = pq.poll();
                if (num > a) {
                    n -= a;
                    pq.offer(num);
                } else {
                    n -= num;
                    pq.offer(a);
                }
                if (n < 0) {
                    break;
                }
            }
            answer++;
        }
        
        return answer;
    }
}