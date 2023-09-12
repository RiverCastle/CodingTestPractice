import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {// 좋다 해결 https://www.acmicpc.net/problem/1253
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] intArr = new int[numberN];
        for (int i = numberN - 1; i >= 0; i--) intArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        Arrays.sort(intArr);
//        System.out.println("Arrays.toString(intArr) = " + Arrays.toString(intArr));

        int answer = 0;
        for (int i = 0; i < numberN; i++) {
            int target = intArr[i];
            int pointer1 = 0;
            int pointer2 = numberN - 1;
            while (pointer1 != pointer2) {
                if (pointer1 == i) pointer1++;
                if (pointer2 == i) pointer2--;
                if (pointer2 <= pointer1) break;
                int sum = intArr[pointer1] + intArr[pointer2];
//                System.out.printf("%d %d %d %d \n", target, sum, intArr[pointer1], intArr[pointer2]);
                if (target == sum) {
//                    System.out.println("***GOOD***");
//                    System.out.println("answer = " + answer);
                    answer++;
                    break;
                } else if (sum > target) pointer2--;
                else if (sum < target) pointer1++;
            }
        }
        System.out.println(answer);
    }
}
