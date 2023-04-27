import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();

        for (int i = 0; i < iVal1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            for (int k = 0; k < 2 * (iVal1 - 1 - i); k++) {
                System.out.printf(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        
        for (int i = 1; i < iVal1; i++) {
            for (int j = 0; j < iVal1 - i; j++) {
                System.out.printf("*");
            }
            for (int k = 0; k < 2 * i; k++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < iVal1 - i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}