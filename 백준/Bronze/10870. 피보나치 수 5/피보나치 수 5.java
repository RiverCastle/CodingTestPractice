import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] intArr = {0, 1};
        if(input < 2) {
            System.out.printf("%d", intArr[input]);
            return;
        } else {
            intArr = new int[input + 1];
            intArr[0] = 0;
            intArr[1] = 1;

            for (int i = 2; i <= input; i++) {
                intArr[i] = intArr[i-2] + intArr[i-1];
            }
            System.out.printf("%d", intArr[input]);
        }
    }
}