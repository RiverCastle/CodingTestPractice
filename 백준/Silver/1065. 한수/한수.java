import java.util.Scanner;

public class Main {//한수
    public static boolean isArithmeticNumber(int n) {
        if (n < 100) {//한 자리, 두 자리
            return true;
        } else {//세 자리 이상
            int behind = n % 10;
            n /= 10;//12
            int front = n % 10;
            int difference = behind - front;
            while (n >= 10) {
                behind = front;
                n /= 10;//1
                front = n % 10;
                if (difference != behind - front) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= number; i++) {
            if (isArithmeticNumber(i)) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}