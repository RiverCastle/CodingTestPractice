public class Solution {
    public int[] solution(int[] arr) {
        int first2Idx = 0;
        int last2Idx = arr.length - 1;
        boolean arrContains2 = false;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2 ) {
                first2Idx = i;
                arrContains2 = true;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2 ) {
                last2Idx = i;
                break;
            }
        }

        if (arrContains2) {
            int[] answer = new int[last2Idx - first2Idx + 1];
            int idx = 0;
            for (int i = first2Idx; i <= last2Idx; i++) {
                answer[idx++] = arr[i];
            }

            return answer;
        } else {
            return new int[] {-1};
        }
    }
/*
    public static void main(String[] args) {
        Solution181894 solution181894 = new Solution181894();
        int[] arr = new int[] {1,2,1,4,5,2,9};
        solution181894.solution(arr);
    }
*/
}