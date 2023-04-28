class Solution {
    public int[] solution(int k, int[] score) {
        int length = score.length;
        int[] hall = new int[k];
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            if (i < k) {
                hall[i] = score[i];
            } else {
                hall[k - 1] = hall[k - 1] > score[i] ? hall[k - 1] : score[i];
            }

            //정렬
            for (int j = 0; j < k - 1; j++) {
                if (hall[j + 1] > hall[j]) { // 10 100 -> 100 10
                    int temp = hall[j];
                    hall[j] = hall[j + 1];
                    hall[j + 1] = temp;
                }
            }
            //정답할당
            if (i < k) {
                answer[i] = hall[i];
            } else {
                answer[i] = hall[k - 1];
            }
        }
        return answer;
    }
}
