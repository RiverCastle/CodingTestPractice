class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s - 1 + overwrite_string.length() + 1);
        return answer;
    }
}