class Solution {
    public int[] solution(int n) {
        int[][] snail = new int[n][n];
        int[] dir = {0, 0}; // x , y 좌표
        int cnt = 1;
        int max = n * (1 + n) / 2;
        char direct = 'D';
        int[] answer = new int[max];

        while (cnt <= max) {

            switch (direct){

                case 'D':
                    if (dir[1] < n && snail[dir[1]][dir[0]] == 0) {
                        snail[dir[1]][dir[0]] = cnt;
                        cnt++;
                        dir[1]++;
                    } else {
                        dir[0]++;
                        dir[1]--;
                        direct = 'R';
                    }
                    break;
                case 'R':
                    if (dir[0] < n && snail[dir[1]][dir[0]] == 0) {
                        snail[dir[1]][dir[0]] = cnt;
                        cnt++;
                        dir[0]++;
                    } else {
                        dir[0] = dir[0] - 2;
                        dir[1]--;
                        direct = 'U';
                    }
                    break;
                case 'U':
                    if (dir[1] > 0 && snail[dir[1]][dir[0]] == 0) {
                        snail[dir[1]][dir[0]] = cnt;
                        cnt++;
                        dir[0]--;
                        dir[1]--;
                    } else {
                        dir[0]++;
                        dir[1] = dir[1] + 2;
                        direct = 'D';
                    }
                    break;
            }

        }

        cnt = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (snail[i][j] != 0) {
                    answer[cnt] = snail[i][j];
                    cnt++;
                }
            }
        }
        return answer;
    }
}