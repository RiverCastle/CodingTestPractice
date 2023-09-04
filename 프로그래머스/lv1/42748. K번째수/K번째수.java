import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int size = commands.length;
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int numberK = commands[i][2];
            int length = end - start + 1;
            int[] updatedArr = new int[length];
            for (int j = 0; j < length; j++) {
                updatedArr[j] = array[j + start];
            }

            updatedArr = Arrays.stream(updatedArr).sorted().toArray();


            answer[i] = updatedArr[numberK - 1];
        }
        return answer;
    }
}