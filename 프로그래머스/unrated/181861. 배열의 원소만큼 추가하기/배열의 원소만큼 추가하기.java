import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = Arrays.stream(arr).sum();
        int[] answer = new int[length];
        int idx = 0;
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                answer[idx] = num;
                idx++;
            }
        }
        return answer;
    }
}