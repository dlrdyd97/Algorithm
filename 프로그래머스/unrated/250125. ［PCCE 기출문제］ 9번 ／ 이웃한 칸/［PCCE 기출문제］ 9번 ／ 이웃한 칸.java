class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = checkColor(board, h, w);
        return answer;
    }
    
    static int checkColor(String[][] arr, int h, int w) {
        int count = 0;

        if (h > 0 && arr[h][w].equals(arr[h - 1][w])) { // 상
            count++;
        }
        if (h < arr.length - 1 && arr[h][w].equals(arr[h + 1][w])) { // 하
            count++;
        }
        if (w > 0 && arr[h][w].equals(arr[h][w - 1])) { // 좌
            count++;
        }
        if (w < arr[0].length - 1 && arr[h][w].equals(arr[h][w + 1])) { // 우
            count++;
        }

        return count;
    }
    
}