import java.util.Arrays;

public class Solution {
    public int solution(String[] strArr) {
        int[] answer = new int[30];
        for (String str : strArr) {
            answer[str.length() - 1] += 1;
        }


        int max = answer[0];
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] > max) {
                max = answer[i];
            }
        }
        return max;
    }

    /*
    public static void main(String[] args) {
        Solution181855 solution181855 = new Solution181855();
        String[] strArr = new String[] {"a","bc","d","efg","hi"};
        solution181855.solution(strArr);
    }
     */
}