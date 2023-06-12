import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {//소인수분해
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numberN = scanner.nextInt();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int lastFactor = 2;
        while (numberN > 1) {
            for (int i = lastFactor; i <= numberN; i++) {
                if (numberN % i == 0) {
                    lastFactor = i;
                    numberN /= lastFactor;
                    bufferedWriter.write(lastFactor + "\n");
                    break;
                }

            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
