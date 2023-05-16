import static java.lang.Math.pow;

class Solution {
    public int crossCalculator(int num1, int num2) {
        int cnt = 1;
        int temp = num2;
        while (temp >= 10) {
            temp /= 10;
            cnt += 1;
        }
        return (int) (pow(10, cnt) * num1) + num2;
    }

    public int solution(int a, int b) {
        int answer1 = crossCalculator(a, b);
        int answer2 = crossCalculator(b, a);

        return answer1 >= answer2 ? answer1 : answer2;
    }
}