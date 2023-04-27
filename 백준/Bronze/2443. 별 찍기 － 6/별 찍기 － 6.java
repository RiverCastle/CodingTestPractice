import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();

        for (int i = 0; i < iVal1; i++) {
            for (int k = 0; k < i; k++) {
                System.out.printf(" ");
            }
            
            for (int j = 0; j < 2 * (iVal1 - i) - 1; j++) {
                System.out.printf("*");
            }

            System.out.println();
        }
    }
}