import java.util.Stack;

public class Solution {
    public Stack<Integer> solution(int[] arr, boolean[] flag) {
        Stack<Integer> answer = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.push(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    answer.pop();
                }
            }
        }
        return answer;
    }
}