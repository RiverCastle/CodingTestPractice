import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCnt = scanner.nextInt();
        int cnt = 0;
        for (int i = 0; i < inputCnt; i++) {
            if (isPrime(scanner.nextInt())) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
