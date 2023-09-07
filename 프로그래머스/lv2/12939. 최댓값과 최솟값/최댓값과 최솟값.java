import java.io.IOException;
import java.util.StringTokenizer;

class Solution {
    public String solution(String s) throws IOException {
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        int size = stringTokenizer.countTokens();
        int[] arr= new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        String answer = min + " " + max;
        return answer;
    }
}