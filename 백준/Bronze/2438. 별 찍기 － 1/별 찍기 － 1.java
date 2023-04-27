import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        for (int i = 1; i <= iVal1; i++) {
            String startxt = "";
            for(int j = 1; j <= i; j ++) {
                startxt+= "*";
            }
            System.out.printf("%s\n",startxt);
        }
    }
}