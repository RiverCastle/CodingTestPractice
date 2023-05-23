import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for (int[] range : intervals) {
            for (int i = range[0]; i <= range[1]; i++) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}