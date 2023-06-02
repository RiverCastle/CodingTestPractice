import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        if (target > 1) {
            BigInteger answer = new BigInteger("0");
            BigInteger num1 = new BigInteger("0");
            BigInteger num2 = new BigInteger("1");
            for (int i = 2; i <= target; i++) {
                answer = num1.add(num2);
                num1 = num2;
                num2 = answer;
            }
            System.out.println(answer);
        } else {
            int[] answer = new int[2];
            answer[0] = 0;
            answer[1] = 1;
            System.out.println(answer[answer[target]]);
        }
    }
}