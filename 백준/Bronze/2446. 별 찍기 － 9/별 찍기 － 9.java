

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = number; i > 0; i--) {
            bufferedWriter.write(" ".repeat(number - i) + "*".repeat(2 * i - 1) + "\n");
        }
        for (int i = 2; i <= number; i++) {
            bufferedWriter.write(" ".repeat(number - i) + "*".repeat(2 * i - 1) + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
