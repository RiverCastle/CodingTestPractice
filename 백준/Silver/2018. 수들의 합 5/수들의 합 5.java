import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= target; i++) {
            int start = i;
            int sum = 0;

            while (sum < target) {
                sum += start++;
            }

            if (sum == target) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
