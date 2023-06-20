import java.io.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numberN = bufferedReader.readLine();
        bufferedReader.close();

        BigDecimal bigDecimal = new BigDecimal(numberN);
        BigDecimal one = new BigDecimal("1");
        BigDecimal two = new BigDecimal("2");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(bigDecimal.multiply(bigDecimal.subtract(one)).divide(two).multiply(bigDecimal.add(one)) + "\n");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
