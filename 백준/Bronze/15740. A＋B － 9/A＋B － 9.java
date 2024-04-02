import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        BigDecimal number1 = new BigDecimal(inputs[0]);
        BigDecimal number2 = new BigDecimal(inputs[1]);
        System.out.println(number1.add(number2));
    }
}