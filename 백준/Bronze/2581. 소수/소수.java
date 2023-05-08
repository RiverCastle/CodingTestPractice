import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberM = scanner.nextInt();
        int numberN = scanner.nextInt();
        if (numberM == 1) {
            numberM = 2;
        }
        int sum = 0;
        int order = 0;
        int min = 0;

        for (int i = numberM; i <= numberN; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                sum += i;
                order += 1;
                if (order == 1) {
                    min = i;
                }
            }
        }
        if (order == 0) {
            System.out.println(-1);
        } else {
            System.out.printf("%d\n%d", sum, min);
        }
    }
}