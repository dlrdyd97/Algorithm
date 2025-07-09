class Solution {
    public long solution(int w, int h) {
        long answer = 1;

        long x = w;
        long y = h;

        long a = gcd(x, y);
        answer = (x * y) - (x + y - a);
        return answer;
    }
    
        public static long gcd(long a, long b) {

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}