import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        num_list = Arrays.stream(num_list).sorted().toArray();
        int[] answer = new int[num_list.length - 5];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i + 5];
        }
        return answer;
    }
}