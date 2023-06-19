import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();
        
        BigDecimal[] pibonachiArr = new BigDecimal[91];
        pibonachiArr[0] = new BigDecimal("0");
        pibonachiArr[1] = new BigDecimal("1");
        for (int i = 0; i <= numberN - 2; i++) {
            pibonachiArr[i + 2] = pibonachiArr[i].add(pibonachiArr[i + 1]);
        }
        System.out.println(pibonachiArr[numberN]);
    }
}
