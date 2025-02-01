import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
	Map<String, Integer> rankings = new HashMap();
	int idx = 0;
	for (String player : players) {
		rankings.put(player, idx++);
	}	
	for(String calling : callings) {
		Integer ranking = rankings.get(calling);
        if (ranking == 0) continue; 
		String temp = players[ranking-1];
		players[ranking-1] = players[ranking];
		players[ranking] = temp;
		rankings.replace(players[ranking], ranking);
		rankings.replace(players[ranking - 1], ranking - 1);
	}
        return players;
    }
}