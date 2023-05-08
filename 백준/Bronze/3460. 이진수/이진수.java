import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        for (int i = 0; i < testNumber; i++) {
            String binaryString = Integer.toBinaryString(scanner.nextInt());
            String reverse = "";
            for (int j = binaryString.length() - 1; j >= 0; j--) {
                reverse += binaryString.charAt(j);
            }

            for (int j = 0; j < reverse.length(); j++) {
                if (reverse.charAt(j) == '1') {
                    System.out.printf("%d ", j);
                }
            }
        }
    }
}