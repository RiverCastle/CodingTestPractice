import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 예제 성공
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        long q = (long) Math.sqrt(n);

        if ((q * q) < n) q++;

        System.out.println(q);
    }
}
