class Solution {
    public String solution(String my_string, int[] indices) {
        String[] splitted = my_string.split("");
        for (int idx : indices) {
            splitted[idx] = "";
        }
        String answer ="";
        for (int i = 0; i < splitted.length; i++) {
            answer += splitted[i];
        }
        return answer;
    }
}