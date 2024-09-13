import java.util.*;

class Solution {
    public int solution(int[] ranks, boolean[] attendance) {
        int length = attendance.length;
        Map<Integer, Integer> results = new HashMap<>();
        for (int i = 0; i < length; i++) {
            results.put(ranks[i], i);
        }
        
        int answer = 0;
        int cnt = 0;
        for (int i = 1; i <= length; i++) {
            if (cnt >= 3) break;
            int sn = results.get(i); // 학생 번호 랭크로 조회
            if (attendance[sn]) {
                cnt++;
                if (cnt == 1) {
                    answer += 10000 * sn;
                } else if (cnt == 2) {
                    answer += 100 * sn;
                } else if (cnt == 3) {
                    answer += sn;
                }
            }
            
        }
        
        return answer;
    }
}