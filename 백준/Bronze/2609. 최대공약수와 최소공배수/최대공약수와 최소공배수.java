import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            int temp = number1;
            number1 = number2; //작은 수
            number2 = temp; //큰 수
        }

        int max = 1;

        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                max = i;
            }
        }
        
        System.out.printf("%d\n", max);

        int min = max * (number1 / max) * (number2 / max);

        System.out.printf("%d\n", min);
    }
}