import java.util.LinkedList;
import java.util.Queue;

class Solution {
    
    static int[][] matrix;
    static int[][] matrix2;
    static Queue<Integer> queue = new LinkedList<>();
    static int[] answer;
    
    public int[] solution(int rows, int columns, int[][] queries) {
        answer = new int[queries.length];
        matrix = new int[rows][columns];
        matrix2 = new int[rows][columns];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = rows * columns;
        }

        int cnt = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = cnt;
                matrix2[i][j] = cnt++;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            queueAdd(queries, i);
            queuePoll(queries, i);
        }
        return answer;
    }
    
    static void queueAdd(int[][] queries, int i) {

        int a = queries[i][0] - 1;
        int b = queries[i][1] - 1;
        for (int j = 0; j <= queries[i][3] - queries[i][1]; j++) { // x 축 오른쪽
            answer[i] = Math.min(answer[i], matrix[a][b]);
            queue.add(matrix[a][b]);
            b++;
        }

        a++;
        b--;
        for (int j = 0; j < queries[i][2] - queries[i][0]; j++) { // y 축 아래
            answer[i] = Math.min(answer[i], matrix[a][b]);
            queue.add(matrix[a][b]);
            a++;
        }

        a--;
        b--;
        for (int j = 0; j < queries[i][3] - queries[i][1]; j++) { // x 축 왼쪽
            answer[i] = Math.min(answer[i], matrix[a][b]);
            queue.add(matrix[a][b]);
            b--;
        }

        a--;
        b++;
        for (int j = 1; j < queries[i][2] - queries[i][0]; j++) {
            answer[i] = Math.min(answer[i], matrix[a][b]);
            queue.add(matrix[a][b]);
            a--;
        }

    }

    static void queuePoll(int[][] queries, int i) {

        int a = queries[i][0] - 1;
        int b = queries[i][1];
        for (int j = 0; j < queries[i][3] - queries[i][1]; j++) { // x 축 오른쪽
            matrix[a][b] = queue.poll();
            b++;
        }

        a++;
        b--;
        for (int j = 0; j < queries[i][2] - queries[i][0]; j++) { // y 축 아래
            matrix[a][b] = queue.poll();
            a++;
        }

        a--;
        b--;
        for (int j = 0; j < queries[i][3] - queries[i][1]; j++) { // x 축 왼쪽
            matrix[a][b] = queue.poll();
            b--;
        }

        a--;
        b++;
        for (int j = 0; j < queries[i][2] - queries[i][0]; j++) {
            matrix[a][b] = queue.poll();
            a--;
        }

    }
    
}