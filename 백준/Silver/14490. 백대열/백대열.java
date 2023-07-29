import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 백대열

    public static int getGCD(int number1, int number2) {
        if (number2 > number1) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        int rest = number1 % number2;
        while (rest != 0) {
            number1 = number2;
            number2 = rest;
            rest = number1 % number2;
        }
        return number2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split(":");
        int numberN = Integer.parseInt(line[0]);
        int numberM = Integer.parseInt(line[1]);
        int gcd = getGCD(numberN, numberM);
        System.out.printf("%d:%d", numberN / gcd, numberM / gcd);
    }
}