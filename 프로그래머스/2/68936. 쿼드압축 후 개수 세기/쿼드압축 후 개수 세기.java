class Solution {
    
    static int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        
        quid(arr, 0, 0, arr.length);
        
        return answer;
    }
    
    static boolean check(int[][] arr, int x, int y, int size) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != arr[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }

    static void quid(int[][] arr, int x, int y, int size) {
        if (check(arr, x, y, size)) {
            answer[arr[x][y]]++;
            return ;
        }

        quid(arr, x, y, size / 2);
        quid(arr, x, y + size / 2, size / 2);
        quid(arr, x + size / 2, y, size / 2);
        quid(arr, x + size / 2, y + size / 2, size / 2);

    }
    
}