class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int deleteNumber : delete_list) {
                if (arr[i] == deleteNumber) {
                    cnt += 1;
                    arr[i] = 0;
                }
            }
        }
        int[] answer = new int[arr.length - cnt];
        int idx = 0;
        for (int addNumber : arr) {
            if (addNumber != 0) {
                answer[idx] = addNumber;
                idx++;
            }
        }
        return answer;
    }
}