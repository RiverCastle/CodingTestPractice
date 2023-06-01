import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int cardsNum = Integer.parseInt(stringTokenizer.nextToken());
        int targetSum = Integer.parseInt(stringTokenizer.nextToken());
        int[] cards = new int[cardsNum];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        bufferedReader.close();

        for (int i = 0; i < cardsNum; i++) {
            cards[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < cardsNum; i++) {
            for (int j = i + 1; j < cardsNum; j++) {
                for (int k = j + 1; k < cardsNum; k++) {
                    int temp = cards[i] + cards[j] + cards[k];
                    if (temp <= targetSum && temp >= max) {
                        max = temp;
                    }
                }
            }
        }
        System.out.println(max);
    }
}