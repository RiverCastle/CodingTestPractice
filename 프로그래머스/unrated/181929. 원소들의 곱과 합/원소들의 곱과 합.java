import static java.lang.Math.pow;

class Solution {
    public int solution(int[] num_list) {
        int multipledValue = 1;
        int summedValue = 0;
        
        for (int i : num_list) {
            multipledValue *= i;
            summedValue += i;
        }
        
        if (multipledValue > pow(summedValue, 2)) {
            return 0;
        } else {
            return 1;
        }
    }
}