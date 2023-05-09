import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        
        for (int i = 0; i < 10; i++) {
            sum -= scanner.nextInt();
            sum += scanner.nextInt();
            if ( max < sum) {
                max = sum;
            }
        }
        
        System.out.printf("%d", max);
    }
}
