import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < tests; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            BigInteger number1 = new BigInteger(stringTokenizer.nextToken(), 2);
            BigInteger number2 = new BigInteger(stringTokenizer.nextToken(), 2);
            System.out.println((number1.add(number2)).toString(2));
        }
    }
}
