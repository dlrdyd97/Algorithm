import java.util.*;
class Solution {
    
    static HashSet<Integer> hs = new HashSet<>();
    static boolean[] visit;
    static String[] arr;
    
    public int solution(String numbers) {
        int answer = 0;

        arr = numbers.split("");
        visit = new boolean[arr.length];

        permutation(0, "");

        for (int i : hs) {
            if (isPrime(i) == 1) {
                answer++;
            }
        }
        return answer;
    }
    

    static void permutation(int index, String s) {

        if(!s.isEmpty()) {
            hs.add(Integer.parseInt(s));
        }

        for (int i = 0; i < arr.length; i++) {
            if(!visit[i]){
                visit[i] = true;
                permutation(index + 1, s + arr[i]);
                visit[i] = false;
            }
        }

    }

    static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    
}