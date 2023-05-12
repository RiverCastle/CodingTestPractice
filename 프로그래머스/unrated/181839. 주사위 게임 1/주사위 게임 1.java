import static java.lang.Math.abs;
import static java.lang.Math.pow;

class Solution {
    public int solution(int a, int b) {
        boolean judgeA = (a % 2 == 1);
        boolean judgeB = (b % 2 == 1);

        if (judgeA && judgeB) {
            return (int) (pow(a, 2) + pow(b, 2));
        } else if (judgeA || judgeB) {
            return 2 * (a + b);
        } else {
            return abs(a - b);
        }
    }
}