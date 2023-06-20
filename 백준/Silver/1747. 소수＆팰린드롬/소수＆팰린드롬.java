import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        if (number < 10) {
            return true;
        } else {
            List<Integer> values = new ArrayList<>();
            while (number >= 10) {
                values.add(number % 10);
                number /= 10;
            }
            values.add(number);
            for (int i = 0; i < values.size() / 2; i++) {
                if (values.get(i) != values.get(values.size() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        boolean found = false;

        while (!found) {
            if (isPrime(numberN) && isPalindrome(numberN)) {
                found = true;
            } else {
                numberN++;
            }
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(numberN + "\n");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
