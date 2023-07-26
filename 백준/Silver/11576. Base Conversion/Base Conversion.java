import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// Base Conversion 예제 해결
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberA = Integer.parseInt(stringTokenizer.nextToken());
        int numberB = Integer.parseInt(stringTokenizer.nextToken());

        int numberM = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] arr = new int[numberM];
        for (int i = 0; i < numberM; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int answer = 0;
        for (int i = 0; i < numberM; i++) {
            answer += Math.pow(numberA, i) * arr[numberM - 1 - i];
        }

        int temp = 1;
        int last = 0;
        while (temp < answer) {
            last++;
            temp *= numberB;

        }

        for (int i = last - 1; i > 0; i--) {
            temp /= numberB;
            System.out.printf("%d ", answer / temp);
            answer = answer % temp;
        }
        System.out.printf("%d", answer);
    }
}
