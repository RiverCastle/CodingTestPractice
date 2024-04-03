import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int[] numbers = new int[numberN];
        for (int i = 0; i < numberN; i++) numbers[i] = Integer.parseInt(inputs[i]);

        // 연속합 구하기
        int max = numbers[0];
        int sum = numbers[0];
        for (int i = 1; i < numberN; i++) {
            int presentValue = numbers[i];
            sum += presentValue;
            if (sum > max) max = sum; //현재 수를 더했을 때, 기존 max보다 클 때,
            else if (presentValue > sum) { // 현재 수가 기존 합보다 클 때, 
                sum = presentValue;
                if (sum > max) max = sum; // 합이 max 보다 클 때, 
            }
        }
        System.out.println(max);
    }
}