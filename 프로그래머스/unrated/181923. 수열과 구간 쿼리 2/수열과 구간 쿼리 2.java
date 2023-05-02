class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int length = queries.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int[] arrOverK = new int[e - s + 1];
            int idx = 0;

            //k보다 큰 것들 배열
            for (int j = s; j <= e; j++) {
                if (k < arr[j]) {
                    arrOverK[idx] = arr[j];
                    idx += 1;
                }
            }

            //정렬 및 정답 할당
            if (idx == 0) { //하나도 없는 경우
                answer[i] = -1;
            } else {
                idx = idx - 1;
                int min = arrOverK[idx];
                for (int l = idx; l >= 0; l--) { //최소값찾기
                    if(arrOverK[l] < min) {
                        min = arrOverK[l];
                    }
                }
                answer[i] = min;

            }
        }
        return answer;
    }
}