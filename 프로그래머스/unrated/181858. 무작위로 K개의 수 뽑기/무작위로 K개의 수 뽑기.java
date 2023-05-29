import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> integerList = new ArrayList<>();
        for (int num : arr) {
            if (integerList.indexOf(num) == -1) {
                integerList.add(num);
            }
        }
        //System.out.println(integerList);
        int[] answer = new int[k];
        for (int i = integerList.size(); i < k; i++) {
            answer[i] = -1;
        }
        //System.out.println(Arrays.toString(answer));
        if (k > integerList.size()){
            for (int i = 0; i < integerList.size(); i++) {
                answer[i] = integerList.get(i);
            }
        } else {
            for (int i = 0; i < k; i++) {
                answer[i] = integerList.get(i);
            }
        }

        //System.out.println(Arrays.toString(answer));
        return answer;
    }
    /*
    public static void main(String[] args) {
        Solution181858 solution181858 = new Solution181858();
        int[] arr = new int[]{0, 1, 1, 2, 2, 3};
        solution181858.solution(arr, 3);
    }
    */
}