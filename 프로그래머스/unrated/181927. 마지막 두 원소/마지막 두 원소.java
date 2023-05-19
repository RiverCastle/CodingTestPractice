class Solution {
    public int[] solution(int[] num_list) {
        int num_listLength = num_list.length;
        int[] answer = new int[num_listLength + 1];
        for (int i = 0; i < num_listLength; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[num_listLength - 1] > num_list[num_listLength - 2]) {
            answer[answer.length - 1] = num_list[num_listLength - 1] - num_list[num_listLength - 2];
        } else {
            answer[answer.length - 1] = num_list[num_listLength - 1] * 2;
        }
        return answer;
    }
}