import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] whitePaper = new int[100][100];

        int width = 0;
        int pieces = scanner.nextInt();
        for (int i = 0; i < pieces; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    if (whitePaper[j][k] != 1) {
                        width += 1;
                        whitePaper[j][k] = 1;
                    }
                }
            }
        }
        System.out.println(width);
    }
}