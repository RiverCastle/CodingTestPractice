import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while (n != 1) {
            if (n % 2 == 0) { //짝수라면
                n /= 2;
            } else { //홀수라면
                n = 3 * n + 1;
            }
            answer.add(n);
        }
        return answer;
    }
}