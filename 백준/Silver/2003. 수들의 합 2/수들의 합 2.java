import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formattable;
import java.util.StringTokenizer;

public class Main {// 수들의 합 2 https://www.acmicpc.net/problem/2003
    private static int[] intArr;

    public static int sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) sum += intArr[i];
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int length = Integer.parseInt(stringTokenizer.nextToken());
        intArr = new int[length];
        int target = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < length; i++) intArr[i] = Integer.parseInt(stringTokenizer.nextToken());

        int answer = 0;
        for (int start = 0; start < length; start++) {
            int end = start;
            int sum = intArr[start];
            while (end < length) {
                if (sum == target) {
                    answer++;
                    break;
                } else if (sum > target) break;
                else if (sum < target && end + 1 < length) sum += intArr[++end];
                else break;
            }
        }
        System.out.println(answer);
    }
}
