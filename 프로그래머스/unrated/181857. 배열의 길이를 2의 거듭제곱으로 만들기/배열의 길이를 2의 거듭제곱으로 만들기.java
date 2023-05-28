public class Solution {
    public int[] solution(int[] arr) {
        int arrLength = arr.length;
        int targetLength = 1;

        while (targetLength < arrLength) {
            targetLength *= 2;
        }

        int[] answer = new int[targetLength];
        
        for (int i = 0; i < arrLength; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}