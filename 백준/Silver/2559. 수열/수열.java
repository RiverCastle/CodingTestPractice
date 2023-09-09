import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 수열 https://www.acmicpc.net/problem/2559
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberN = Integer.parseInt(stringTokenizer.nextToken());
        int numberK = Integer.parseInt(stringTokenizer.nextToken());

        int[] tempArr = new int[numberN];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < numberN; i++) tempArr[i] = Integer.parseInt(stringTokenizer.nextToken());

        int start = 0;
        int end = start + numberK - 1;
        int tempSum = 0;
        for (int i = start; i <= end; i++) tempSum += tempArr[i];
        int answer = tempSum;
        start++;
        end++;

        while (end < numberN) {
//            System.out.printf("%d %d", start, end);
//            System.out.printf(" %d\n", tempSum);
            tempSum = tempSum + tempArr[end] - tempArr[start - 1];
            if (tempSum > answer) answer = tempSum;
            start++;
            end++;
        }
        System.out.println(answer);
    }
}
