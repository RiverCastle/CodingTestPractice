class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = arr[0] + arr[1];
        if (n <= 2) answer = arr[n];
        else {
            while (n > 2) {
                n -= 1;
                arr[0] = arr[1] % 1234567;
                arr[1] = arr[2] % 1234567;
                arr[2] = (arr[0] + arr[1]) % 1234567;
            }
        }
        answer = arr[2];
        return answer;
    }
}