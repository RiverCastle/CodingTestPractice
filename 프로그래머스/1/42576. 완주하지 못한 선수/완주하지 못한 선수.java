import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participants, String[] completions) {
        Map<String, Integer> statuses = new HashMap<>();
        for (String participant : participants) {
            if (statuses.containsKey(participant)) {
                statuses.replace(participant, statuses.get(participant) + 1);
            } else statuses.putIfAbsent(participant, 1);
        }
        
        for (String completion : completions) {
            statuses.replace(completion, statuses.get(completion) - 1);
        }
        
        for (String participant : participants) 
            if (statuses.get(participant) != 0) return participant;
        
        return "";
    }
}