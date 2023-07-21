import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inputTokens = new StringTokenizer(bufferedReader.readLine());

        int numberN = Integer.parseInt(inputTokens.nextToken());
        int numberD = Integer.parseInt(inputTokens.nextToken());

        int answer = 0;
        for (int i = 1; i <= numberN; i++) {
            if (i < 10) {
                if (i == numberD) answer++;
            } else {
                int temp = i;
                while (temp >= 10) {
                    int rest = temp % 10;
                    if (rest == numberD) answer++;
                    temp = temp / 10;
                }
                if (temp == numberD) answer++;
            }
        }
        System.out.println(answer);
    }
}
