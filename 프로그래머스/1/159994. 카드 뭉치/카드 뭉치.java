import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue queue1 = new LinkedList();
        Queue queue2 = new LinkedList();
        for (String card: cards1) {
            queue1.add(card);
        }
        for (String card: cards2) {
            queue2.add(card);
        }
        for (int i = 0; i < goal.length; i++) {
            String target = goal[i];
            if (target.equals(queue1.peek())) {
                queue1.poll();
                continue;
            } else if (target.equals(queue2.peek())) {
                queue2.poll();
                continue;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}