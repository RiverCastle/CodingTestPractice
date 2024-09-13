import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        Map<Integer, Integer> month = new HashMap<>();
        Map<Integer, String> date = new HashMap<>();
        
        month.put(1, 31);
        month.put(2, 29);
        month.put(3, 31);
        month.put(4, 30);
        month.put(5, 31);
        month.put(6, 30);
        month.put(7, 31);
        month.put(8, 31);
        month.put(9, 30);
        month.put(10, 31);
        month.put(11, 30);
        month.put(12, 31);
        
        date.put(0,"THU");
        date.put(1,"FRI");
        date.put(2,"SAT");
        date.put(3,"SUN");
        date.put(4,"MON");
        date.put(5,"TUE");
        date.put(6,"WED");
        
        for(int i = 1; i < a; i++) {
            b += month.get(i);
        }
        answer = date.get(b % 7); 
        
        
        return answer;
    }
}