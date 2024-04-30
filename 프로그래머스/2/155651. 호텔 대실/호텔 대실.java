class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;

        int waitingTime = 10; // 대기시간 바뀌면 이 부분 변경
        int[] rooms = new int[24 * 60 + waitingTime];

        for (String[] time : book_time) {
            String inTime = time[0];
            String outTime = time[1];

            rooms[calTime(inTime)]++;
            rooms[calTime(outTime) + waitingTime]--;
        }

        for (int i = 1; i < rooms.length; i++) {
            rooms[i] += rooms[i - 1];
            answer = Math.max(answer, rooms[i]);
        }
        return answer;
    }
    
    private static int calTime(String time) {
        String[] split = time.split(":");
        String hour = split[0];
        String minute = split[1];
        return (Integer.parseInt(hour) * 60) + Integer.parseInt(minute);
    }
    
}