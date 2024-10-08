class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int video_len_int = Integer.parseInt(video_len.split(":")[0]) * 60 + Integer.parseInt(video_len.split(":")[1]);
        int pos_int = Integer.parseInt(pos.split(":")[0]) * 60 + Integer.parseInt(pos.split(":")[1]);
        int op_start_int = Integer.parseInt(op_start.split(":")[0]) * 60 + Integer.parseInt(op_start.split(":")[1]);
        int op_end_int = Integer.parseInt(op_end.split(":")[0]) * 60 + Integer.parseInt(op_end.split(":")[1]);

        for (int i = 0; i < commands.length; i++) {
            if (opCheck(pos_int, op_start_int, op_end_int)) {
                pos_int = op_end_int;
            }

            if (commands[i].equals("next")) { // commands = next
                if (endCheck(pos_int, video_len_int)) {
                    pos_int += 10;
                } else {
                    pos_int = video_len_int;
                }
            } else if (commands[i].equals("prev")) { // commands = prev
                if (startCheck(pos_int, 0)) {
                    pos_int -= 10;
                } else {
                    pos_int = 0;
                }
            }

        }

        if (opCheck(pos_int, op_start_int, op_end_int)) {
            pos_int = op_end_int;
        }
        answer = String.format("%02d:%02d", pos_int / 60, pos_int % 60);
        return answer;
    }
    
    static boolean opCheck(int time, int op_start, int op_end) {
        if (op_start <= time && time <= op_end) {
            return true;
        }
        return false;
    }
    
    static boolean endCheck(int time, int end_time) {
        if (time + 10 >= end_time) {
            return false;
        }
        return true;
    }

    static boolean startCheck(int time, int stard_time) {
        if (time - 10 <= stard_time) {
            return false;
        }
        return true;
    }
    
}