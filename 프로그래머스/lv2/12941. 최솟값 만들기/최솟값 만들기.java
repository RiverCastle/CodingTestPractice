import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        // System.out.println("Arrays.toString(A) = " + Arrays.toString(A));
        // System.out.println("Arrays.toString(B) = " + Arrays.toString(B));

        int size = A.length;
        for (int i = 0; i < A.length; i++) answer += A[i] * B[size - 1 - i];
        return answer;
    }
}