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
        int test = Integer.parseInt(bufferedReader.readLine());

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < test; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            bufferedWriter.write(getGCD(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())) + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
