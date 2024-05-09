class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        int maxPlayTime = -1;
        m = changeNote(m);

        for (int i = 0; i < musicinfos.length; i++) {

            String[] music = musicinfos[i].split(",");
            music[3] = changeNote(music[3]);

            String[] times = music[0].split(":");
            int start = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
            int end = 0;
            times = music[1].split(":");
            end = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
            int play = end - start;

            if (play > music[3].length()) {
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < play / music.length; j++) {
                    sb.append(music[3]);
                }
                sb.append(music[3].substring(0, play % music[3].length()));
                music[3] = sb.toString();
            } else {
                music[3] = music[3].substring(0, play);
            }

            if (music[3].contains(m) && play > maxPlayTime) {
                answer = music[2];
                maxPlayTime = play;
            } 

        }

        if (answer == "") {
            answer = "(None)";
        }
        
        return answer;
    }
    
    static String changeNote(String note) {
        return note.replace("C#", "H")
                .replace("D#", "I")
                .replace("F#", "J")
                .replace("G#", "K")
                .replace("A#", "L")
                .replace("B#", "M")
                .toUpperCase();
    }
    
}