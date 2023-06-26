import java.io.*;
import java.util.*;

public class Main {
    public static int getGCD(int number1, int number2) {
        if (number1 < number2) {
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
        int tests = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < tests; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int[] intArr= new int[Integer.parseInt(stringTokenizer.nextToken())];
            for (int j = 0; j < intArr.length; j++) {
                intArr[j] = Integer.parseInt(stringTokenizer.nextToken());
            }
            List<Integer> gcds = new ArrayList<>();
            for (int j = 0; j < intArr.length; j++) {
                for (int k = j + 1; k < intArr.length; k++) {
                    gcds.add(getGCD(intArr[j], intArr[k]));
                }
            }
            long sum = 0;
            for (int gcd : gcds) {
                sum += gcd;
            }
            bufferedWriter.write(sum + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
