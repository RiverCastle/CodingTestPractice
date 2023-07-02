import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        bufferedReader.close();

        long numberA = Long.parseLong(stringTokenizer.nextToken());
        long numberB = Long.parseLong(stringTokenizer.nextToken());

        if (numberB <= numberA) {
            long temp = numberB;
            numberB = numberA;
            numberA = temp;
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        if (numberB - numberA < 2) {
            bufferedWriter.write(0 + "");
        } else {
            bufferedWriter.write(numberB - numberA - 1 + "\n");

            for (long i = numberA + 1; i < numberB - 1; i++) {
                bufferedWriter.write(i + " ");
            }
            bufferedWriter.write(numberB - 1 + "");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
