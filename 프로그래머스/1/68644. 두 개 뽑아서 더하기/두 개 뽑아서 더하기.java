import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {
        Set<Integer> results = new HashSet<>();
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                results.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> answer = new ArrayList<>();
        for (int result : results) answer.add(result);
        Collections.sort(answer);
        return answer;
    }
}