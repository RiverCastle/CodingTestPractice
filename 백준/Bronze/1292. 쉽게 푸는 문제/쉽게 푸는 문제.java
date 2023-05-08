import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt() - 1; // 1 ~
        int end = scanner.nextInt(); // ~ 1000
        int[] intArr = new int[end];
        int value = 1;
        int length = 0;
        int sum = 0;

        for (int i = 0; i < end; i++) {
            for (int j = 0; j < value; j++) {
                intArr[i] = value;
                i++;
                length++;

                if (length >= end) {
                    break;
                }
            }
            i--;
            value++;
        }
        for (int i = start; i < end; i++) {
            sum += intArr[i];
        }
        System.out.printf("%d", sum);
    }
}