import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 블랙잭
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 카드 갯수, 목표 숫자
        StringTokenizer infoToken = new StringTokenizer(reader.readLine());
        int cardCount = Integer.parseInt(infoToken.nextToken());
        int target = Integer.parseInt(infoToken.nextToken());

        StringTokenizer cardTokens = new StringTokenizer(reader.readLine());
        int[] cards = new int[cardCount];
        for (int i = 0; i < cardCount; i++) {
            cards[i] = Integer.parseInt(cardTokens.nextToken());
        }

        int max = 0;

        // 3장의 카드를 뽑는다.
        // 첫번째 카드 -> n 장의 카드가 있다면 첫번째는 n - 2 까지
        for (int i = 0; i < cardCount - 2; i++) {
            // 두번째 카드 -> 두번째는 n - 1 까지
            for (int j = i + 1; j < cardCount - 1; j++) {
                // 세번째 카드 -> 세번째는 n 까지
                for (int k = j + 1; k < cardCount; k++) {
                    //System.out.println("선택한 카드 출력");
                    // TODO
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= target && max < sum) {
                        max = sum;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Main().solution());
    }
}
