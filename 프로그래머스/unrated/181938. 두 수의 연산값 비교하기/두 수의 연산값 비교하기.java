class Solution {
    public int circleCrossCalculation(int num1, int num2) {
        int temp = num2;
        int cnt = 1;
        while (temp >= 10) {
            temp /= 10;
            cnt++;
        }
        while (cnt > 0) {
            num1 *= 10;
            cnt--;
        }
        return num1 + num2;
    }

    public int solution(int a, int b) {
        int result1 = circleCrossCalculation(a, b);
        int result2 = 2 * a * b;
        return result1 >= result2 ? result1 : result2;
    }
}