import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] arr) {
        Queue queue = new ArrayDeque();
        int last = arr[0];
        for (int num : arr) {
            if (queue.size() == 0) {
                queue.add(num);
                last = num;
            } else {
                if (num != last) {
                    queue.add(num);
                    last = num;
                }
            }
        }


        int[] answer = new int[queue.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) queue.poll();
        }
        return answer;
    }
}
