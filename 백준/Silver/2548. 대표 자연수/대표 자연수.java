
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(br.readLine());
        int[] numbers = new int[numberN];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < numberN; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }
        br.close();

        // 배열 통계
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numberN; i++) {
            int temp = numbers[i];
            if (temp > max) max = temp;
            if (min > temp) min = temp;
        }

        // 대표 자연수 찾기
        int minOfSums = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = min; i <= max; i++) {
            int tempSum = 0;
            for (int number : numbers) {
                tempSum += Math.abs(number - i);
            }
            if (minOfSums > tempSum) {
                minOfSums = tempSum;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
