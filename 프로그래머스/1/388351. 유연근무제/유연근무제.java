class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            int cnt = 0;
            int day = startday;
            int schcal=getSchedule(schedules[i]);
                for (int j = 0; j < 7; j++) {
                    if (day % 7 == 0 || day % 7 == 6) {
                        day++;
                        continue;
                    }
                    if (timelogs[i][j] - schcal <= 0) {
                        day++;
                        cnt++;
                    } else {
                        break;
                    }
                }
            if (cnt == 5) {
                answer++;
            }
        }
        
        return answer;
    }

    static public int getSchedule(int schedules) {

        schedules += 10;
        if (schedules % 100 >= 60) {
            int h = (schedules / 100) + 1;
            int m = (schedules % 100) - 60;
            schedules = (h * 100) + m;
        }

        return schedules;
    }
    
}