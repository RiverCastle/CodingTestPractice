import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int factorsNumber = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int firstNum = Integer.parseInt(stringTokenizer.nextToken());
        int max = firstNum;
        int min = firstNum;

        for (int i = 1; i < factorsNumber; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min * max);
    }
}