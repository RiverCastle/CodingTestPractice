import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        System.out.println(Arrays.toString(arr));
        int length = myString.endsWith("x") ? arr.length + 1 : arr.length;
        int[] answer = new int[length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution("oxooxoxxox")));
    }
}