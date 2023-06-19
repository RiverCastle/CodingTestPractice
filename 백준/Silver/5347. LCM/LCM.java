import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int getGCD(int num1, int num2) {
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int rest = num1 % num2;
        while (rest != 0) {
            num1 = num2;
            num2 = rest;
            rest = num1 % num2;
        }
        return num2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < tests; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int number1 = Integer.parseInt(stringTokenizer.nextToken());
            int number2 = Integer.parseInt(stringTokenizer.nextToken());
            int gcd = getGCD(number1, number2);
            bufferedWriter.write(((long) gcd * number1 / gcd * number2 / gcd) + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}