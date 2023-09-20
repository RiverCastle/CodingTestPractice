
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {// 두 배 더하기 https://www.acmicpc.net/problem/12931
    private static int length;
    public static int containsOdd(int[] arr) {
        for (int i = 0; i < length; i++) if (arr[i] % 2 != 0) return i;
        return -1;
    }
    public static int[] divide(int[] arr) {
        for (int i = 0; i < length; i++) arr[i] = arr[i] / 2;
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        length = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[length];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < length; i++) arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        int sum = Arrays.stream(arr).sum();
        int answer = 0;

        while (sum != 0) {
//            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            answer++;
            int indexOrMinusOne = containsOdd(arr);
            if (indexOrMinusOne == -1) arr = divide(arr);
            else arr[indexOrMinusOne] = arr[indexOrMinusOne] - 1;
            sum = Arrays.stream(arr).sum();
        }
        System.out.println(answer);
    }
}
