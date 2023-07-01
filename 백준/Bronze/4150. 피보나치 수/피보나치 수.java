import java.io.*;
import java.math.BigDecimal;

public class Main {// 피보나치 수
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        BigDecimal[] arr = new BigDecimal[3];
        arr[0] = new BigDecimal("0");
        arr[1] = new BigDecimal("1");
        arr[2] = arr[0].add(arr[1]);
        if (number < 2) {
            System.out.println(arr[number]);
        } else {
            int cnt = 2;
            while (number > cnt) {
                arr[0] = arr[1];
                arr[1] = arr[2];
                arr[2] = arr[0].add(arr[1]);
                cnt++;
            }
            System.out.println(arr[2]);
        }
    }
}
