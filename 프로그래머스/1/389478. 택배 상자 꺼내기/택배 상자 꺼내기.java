class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        int top = (int) (Math.ceil((double) n / w)); // 최고층의 층수

        int target = (int) (Math.ceil((double) num / w)); // 꺼내려는 상자의 층수
        answer = top - target + 1;

        if (n % w == 0) { // 박스가 직사각형이면

        }else {
            if (top % 2 == 0) { // 최고층이 짝수층
                if (target % 2 == 0) { // 타켓 상자가 짝수층
                    if (n % w < num % w) { // 최고층 상자를 무시하는 경우
                        answer--;
                    }
                } else { // 타겟 상자가 홀수층
                    if (num % w < w - (n % w) + 1 && num % w != 0) {
                        answer--;
                    }
                }

            } else { // 최고층이 홀수층
                if (target % 2 == 0) { // 타켓 상자가 짝수층
                    if ((w - (num % w) + 1) > n % w && num % w != 0) {
                        answer--;
                    }
                }else { // 타켓 상자가 홀수층
                    if (n % w < num % w || num % w == 0) {
                        answer--;
                    }
                }
            }
        }
        return answer;
    }
}