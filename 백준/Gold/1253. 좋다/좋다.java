import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {// 좋다 https://www.acmicpc.net/problem/1253
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < numberN; i++) priorityQueue.add(Integer.parseInt(stringTokenizer.nextToken()));
        int[] intArr = new int[numberN];
        for (int i = numberN - 1; i >= 0; i--) intArr[i] = priorityQueue.poll();

        int answer = 0;
        for (int i = 0; i < numberN; i++) {
            int target = intArr[i];
            int pointer1 = 0;
            int pointer2 = numberN - 1;
            while (pointer1 != pointer2) {
                if (pointer1 == i) pointer1++;
                if (pointer2 == i) pointer2--;
                if (pointer2 <= pointer1) break; // 혹시 몰라서
                int sum = intArr[pointer1] + intArr[pointer2];

                if (target == sum) {
//                    System.out.println("***GOOD***");
                    answer++;
                    break;
                } else if (sum > target) pointer1++;
                else if (sum < target) pointer2--;
            }
        }
        System.out.println(answer);
    }
}
