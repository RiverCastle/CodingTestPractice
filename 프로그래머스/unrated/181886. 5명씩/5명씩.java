class Solution {
    public String[] solution(String[] names) {
        int length = names.length;
        String[] answer = new String[length % 5 == 0 ? length / 5 : length / 5 + 1];
        int idx = 0;
        for (int i = 0; i < length; i += 5) {
            answer[idx] = names[i];
            idx++;
        }
        return answer;
    }
}