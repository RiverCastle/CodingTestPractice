
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int numberN;
        long res = 0; // 1000000까지

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        numberN = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= numberN; i++) {
            res += i * (numberN / i);
        }
        System.out.println(res);
    }
}
