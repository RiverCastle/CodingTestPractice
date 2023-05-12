class Solution {
    public int solution(String num_str) {
        String[] strArr= num_str.split("");
        int answer = 0;
        for (String str : strArr) {
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}