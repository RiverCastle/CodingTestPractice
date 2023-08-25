import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[][] answerArr;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        answerArr = new int[numberN][10];
        int divisor = 1000000000;

        for (int i = 0; i < 10; i++) {
            answerArr[0][i] = 1;
        }
        for (int i = 1; i < numberN; i++) {
            answerArr[i][0] = answerArr[i - 1][1] % divisor;
            for (int j = 1; j < 9; j++) {
                answerArr[i][j] = (answerArr[i - 1][j - 1] % divisor + answerArr[i - 1][j + 1] % divisor) % divisor;
            }
            answerArr[i][9] = answerArr[i - 1][8] % divisor;
        }

        int answer = 0;
        for (int i = 1; i < 10; i++) {
            answer = (answer + answerArr[numberN - 1][i]) % divisor;
        }
        System.out.println(answer);
    }
}
