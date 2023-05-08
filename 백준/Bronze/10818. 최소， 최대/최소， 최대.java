import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        int temp = scanner.nextInt();
        int max = temp;
        int min = temp;
        for (int i = 1; i< testNumber; i++) {
            temp = scanner.nextInt();
            if (max < temp) {
                max = temp;
            }
            if (min > temp) {
                min = temp;
            }
        }
        System.out.printf("%d %d\n", min, max);
    }
}
