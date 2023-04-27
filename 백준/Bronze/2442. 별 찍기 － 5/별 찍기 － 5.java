import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();

        for (int i = 0; i < iVal1; i++) {
            for (int j = 0; j < iVal1 - 1 - i; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < 2 * (i + 1) - 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}