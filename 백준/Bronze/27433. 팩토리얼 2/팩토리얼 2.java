import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputN = scanner.nextInt();

        long answer = 1;
        for (int i = 1; i <= inputN; i++) {
            answer *= i;
        }

        System.out.println(answer);
    }
}