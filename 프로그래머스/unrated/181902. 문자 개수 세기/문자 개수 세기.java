public class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            int alphabet = my_string.charAt(i);
            if (alphabet >= 97) {
                answer[alphabet - 65 - 6] += 1;
            } else {
                answer[alphabet - 65] += 1;
            }
        }
        return answer;
    }
}