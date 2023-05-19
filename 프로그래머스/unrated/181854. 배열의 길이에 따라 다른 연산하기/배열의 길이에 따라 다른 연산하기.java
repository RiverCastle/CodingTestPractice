class Solution {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        if (length % 2 == 1) {
            for (int i = 0; i < length; i = i + 2) {
                arr[i] += n;
            }
        } else {
            for (int i = 1; i < length; i = i + 2) {
                arr[i] += n;
            }
        }
        return arr;
    }
}