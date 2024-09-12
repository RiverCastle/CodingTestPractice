class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // video_len 정리
        String[] mmss = video_len.split(":");
        int video_len_sec = (Integer.parseInt(mmss[0]) * 60) + Integer.parseInt(mmss[1]);

        // op_start 정리
        mmss = op_start.split(":");
        int op_start_sec = (Integer.parseInt(mmss[0]) * 60) + Integer.parseInt(mmss[1]);

        // op_end 정리
        mmss = op_end.split(":");
        int op_end_sec = (Integer.parseInt(mmss[0]) * 60) + Integer.parseInt(mmss[1]);

        // 현재 재생 위치 정리
        mmss = pos.split(":");
        int pos_sec = (Integer.parseInt(mmss[0]) * 60) + Integer.parseInt(mmss[1]);
        System.out.println(pos_sec);
        
        if (op_start_sec <= pos_sec & pos_sec < op_end_sec) pos_sec = op_end_sec;
        
        System.out.println(pos_sec);
        
        for (String command : commands) {
            
            if (command.equals("next")) {
                pos_sec += 10;
                if (pos_sec > video_len_sec) pos_sec = video_len_sec;
            }
            else if (command.equals("prev")) {
                pos_sec -= 10;
                if (pos_sec < 0) pos_sec = 0;
            }
            if (op_start_sec <= pos_sec & pos_sec < op_end_sec) pos_sec = op_end_sec;
            
            System.out.println(pos_sec);
        }

        int mm = pos_sec / 60;
        int ss = pos_sec % 60;

        String mm_final = String.format("%2s", mm).replace(" ", "0");
        String ss_final = String.format("%2s", ss).replace(" ", "0");
        StringBuilder sb = new StringBuilder();
        sb.append(mm_final).append(":").append(ss_final);
        return sb.toString();
    }
}