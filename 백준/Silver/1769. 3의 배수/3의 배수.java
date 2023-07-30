import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {// 3의 배수
    public static int changeProblem(int number) {
        if (number < 10) return number;
        else {
            int answer = 0;
            while (number != 0) {
                answer += number % 10;
                number /= 10;
            }
            return answer;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        if (line.length() == 1) {
            System.out.println(0);
            System.out.println(Integer.parseInt(line) % 3 == 0 ? "YES" : "NO");
        } else {
            int turn = 1;
            int numberY = 0;
            for (int i = 0; i < line.length(); i++) {
                numberY += line.charAt(i) - '0';
            }
            while (numberY >= 10) {
                numberY = changeProblem(numberY);
                turn++;
            }
            System.out.println(turn);
            System.out.println(numberY % 3 == 0 ? "YES" : "NO");
        }
    }
}
