class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String answer = "";
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                answer += todo_list[i] + " ";
            }
        }
        return answer.trim().split(" ");
    }
}