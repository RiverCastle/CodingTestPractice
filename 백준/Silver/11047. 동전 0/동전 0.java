import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 동전 0
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer info = new StringTokenizer(reader.readLine());
        int coinKinds = Integer.parseInt(info.nextToken());
        int targetAmount = Integer.parseInt(info.nextToken());

        int[] coins = new int[coinKinds];
        for (int i = 0; i < coinKinds; i++) {
            coins[i] = Integer.parseInt(reader.readLine());
        }

        int answer = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            answer += targetAmount / coins[i];
            targetAmount = targetAmount % coins[i];
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Main().solution());
    }
}
