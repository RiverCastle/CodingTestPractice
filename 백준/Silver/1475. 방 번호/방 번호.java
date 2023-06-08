import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomNumber = scanner.nextInt();
        int[] numbersCnt = new int[10];

        while (roomNumber >= 10) {
            numbersCnt[roomNumber % 10] += 1;
            roomNumber /= 10;
        }
        numbersCnt[roomNumber] += 1;
        numbersCnt[6] = (numbersCnt[6] + numbersCnt[9]) % 2 == 1 ? (numbersCnt[6] + numbersCnt[9] + 1) / 2 : (numbersCnt[6] + numbersCnt[9]) / 2;
        numbersCnt[9] = 0;

        int max = 0;
        for (int cnt : numbersCnt) {
            if (cnt > max) {
                max = cnt;
            }
        }

        System.out.println(max);
        
    }
}