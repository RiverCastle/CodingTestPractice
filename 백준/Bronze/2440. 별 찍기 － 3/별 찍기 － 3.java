import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        String starstxt = "";
        for (int i = 0; i < iVal1; i++) {
            starstxt += "*";
        }
        for (int i = 0; i < iVal1; i++) {
            System.out.printf("%s\n",starstxt.substring(i));
        }
    }
}