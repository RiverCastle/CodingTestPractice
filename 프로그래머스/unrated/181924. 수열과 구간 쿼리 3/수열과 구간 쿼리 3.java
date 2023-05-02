class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int length = queries.length;
        for (int i = 0; i < length; i++) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        return arr;
    }
}