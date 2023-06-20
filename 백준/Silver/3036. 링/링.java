import java.io.*;
import java.util.StringTokenizer;

public class Main {// 링
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
        int rings = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        bufferedReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int ring1 = Integer.parseInt(stringTokenizer.nextToken());
        for (int i = 0; i < rings - 1; i++) {
            int ringElse = Integer.parseInt(stringTokenizer.nextToken());
            int gcd = getGCD(ring1, ringElse);
            bufferedWriter.write(ring1/gcd + "/" + ringElse/gcd + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
