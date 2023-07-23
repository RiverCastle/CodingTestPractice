import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] arr = new int[numberN];

        int sum = 0;
        for (int i = 0; i < numberN; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
            sum += arr[i];
        }

        long answer = 0;

        for (int i = 0; i < numberN - 1; i++) {
            sum -= arr[i];
            answer += sum * arr[i];
        }
        System.out.println(answer);
    }
}
