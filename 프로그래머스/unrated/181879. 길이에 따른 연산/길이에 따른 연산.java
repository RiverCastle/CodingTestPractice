class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        if(length >= 11) {
            int answer = 0;
            for(int i = 0; i < length; i++) {
                answer += num_list[i];
            }
            return answer;
        } else {
            int answer = 1;
            for(int i = 0; i < length; i++) {
                answer *= num_list[i];
            }
            return answer;
        }
    }
}