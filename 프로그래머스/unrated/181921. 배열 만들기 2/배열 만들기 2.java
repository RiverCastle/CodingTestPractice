class Solution {
    public int[] solution(int l, int r) {
        int time = 0;
        for (int i = l; i <= r; i++) {
            if (isZeroOrFive(i)) {
                time++;
            }
        }
        if (time == 0) {
            int[] answer = {-1};
            return answer;
        } else {
            int[] answer = new int[time];
            int idx = 0;
            for (int i = l; i <= r; i++) {
                if (isZeroOrFive(i)) {
                    answer[idx] = i;
                    idx++;
                }
            }
            return answer;
        }
    }

    public static boolean isZeroOrFive(int n) {
        int cnt = 0;
        while (n > 0) {
            if (n % 10 == 0 || n % 10 == 5) {
                n /= 10;
                cnt++;
            } else {
                return false;
            }
        }
        return true;
    }
}