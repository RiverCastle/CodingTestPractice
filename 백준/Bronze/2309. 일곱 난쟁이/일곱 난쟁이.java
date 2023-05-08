import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] boys = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            boys[i] = scanner.nextInt();
            sum += boys[i];
        }
        //선별
        sum -= 100;
        int k = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (boys[i] + boys[j] == sum) {
                    boys[i] = 123;
                    k = j;
                    break;
                }
            }
            if (boys[i] == 123) {
                boys[k] = 123;
                break;
            }
            }

        //정렬
        for (int i = 0; i < 9; i++) {
            int temp = boys[i];
            for (int j = i + 1; j < 9; j++) {
                if (temp > boys[j]) {
                    boys[i] = boys[j];
                    boys[j] = temp;
                    temp = boys[i];
                }
            }
        }
        //출력
        for (int i = 0; i < 7; i++) {
            System.out.printf("%d\n", boys[i]);
        }
    }
}