import java.util.Scanner;

public class Main {//분해합
    public static int disassembleSum(int num) {
        int sum = 0;
        int temp = num;

        while (temp >= 10) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum + temp + num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int answer = 0;
        while (disassembleSum(answer) != number && answer < number) {
            answer += 1;
        }
        if (disassembleSum(answer) != number) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }
}
