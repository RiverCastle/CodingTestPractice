import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {// 최대 GCD

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
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberN = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberN; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int size = stringTokenizer.countTokens();
            int[] intArr = new int[size];

            for (int j = 0; j < size; j++) {
                intArr[j] = Integer.parseInt(stringTokenizer.nextToken());
            }

            int answer = 1;
            for (int j = 0; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    int number1 = intArr[j];
                    int number2 = intArr[k];
                    int gcd = getGCD(number1, number2);
                    if (gcd > answer) {
                        answer = gcd;
                    }
                }
            }
            bufferedWriter.write(answer + "\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
