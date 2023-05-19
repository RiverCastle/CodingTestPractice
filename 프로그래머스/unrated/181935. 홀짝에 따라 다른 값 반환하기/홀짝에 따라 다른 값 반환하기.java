import static java.lang.Math.pow;

class Solution {
    public int solution(int n) {
        int answer = 0;
        if ( n % 2 == 0) {
            for (int i = n; i > 0; i = i - 2) {
                answer += pow(i,2);
            }
        } else {
            for (int i = n; i > 0; i = i - 2) {
                answer += i;
            }
        }
        return answer;
    }
}