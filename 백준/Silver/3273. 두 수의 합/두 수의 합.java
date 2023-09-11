
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {// 두 수의 합 https://www.acmicpc.net/problem/3273

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] intArr = new int[numberN];
        for (int i = 0; i < numberN; i++) intArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        Arrays.sort(intArr);
//        System.out.println(Arrays.toString(intArr));
        int numberX = Integer.parseInt(bufferedReader.readLine());
//        System.out.println("numberX = " + numberX);
        int answer = 0;
        int start = 0;
        int end = numberN - 1;
        while (start < end) {
            int sum = intArr[start] + intArr[end];
//            System.out.printf("%d  %d  %d\n", start, end, sum);
            if (sum > numberX) end--;
            else if (sum == numberX) {
                answer++;
                start++;
                end--;
            } else start++;
        }
        System.out.println(answer);
    }
}
