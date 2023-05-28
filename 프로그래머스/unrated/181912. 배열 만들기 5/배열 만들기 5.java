import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String intStr : intStrs) {
            boolean judge = false;
            for (int i = s; i <= intStr.length() - l; i++) {
                int num = Integer.parseInt(intStr.substring(s, s + l));
                if (num > k) {
                    answer.add(num);
                    judge = true;
                }
                if (judge) {
                    break;
            }
            }
        }
        return answer;
    }
}