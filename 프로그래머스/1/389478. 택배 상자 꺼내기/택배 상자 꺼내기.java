class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        int a = 0; // w 상자의 층수
        int a_position = 0; // w상자의 위치
        int b = 0; //
        int b_position = 0; // 꼭대기층의 위치

        if (num % w == 0) {
            a = num / w;
        } else {
            a = num / w + 1;
        }

        if (n % w == 0) {
            b = n / w;
        } else {
            b = n / w + 1;
        }

        if (a % 2 == 0) { // 짝수층이면
            if (num % w == 0) {
                a_position = 0;
            }else {
                a_position = w - (num % w);
            }
        } else { // 홀수층이면
            if (num % w == 0) {
                a_position = w - 1;
            } else {
                a_position = num % w - 1;
            }
        }

        if (b % 2 == 0) { // 짝수층이면
            if (n % w == 0) {
                b_position = 0;
            } else {
                b_position = w - (n % w);
            }

            if(b_position<=a_position){
                answer = b - a + 1;
            }else {
                answer = b - a;
            }

        } else { // 홀수 층이면
            if (n % w == 0) {
                b_position = w - 1;
            }else {
                b_position = n % w - 1;
            }

            if (b_position >= a_position) {
                answer = b - a + 1;
            } else {
                answer = b - a;
            }
        }
        return answer;
    }
}