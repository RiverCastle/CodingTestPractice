
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(br.readLine());

        Map<Long, Integer> cards = new HashMap<>();
        for (int i = 0; i < numberN; i++) {
            long card = Long.parseLong(br.readLine());
            if (cards.containsKey(card)) {
                int currentCnt = cards.get(card);
                cards.put(card, currentCnt + 1);
            } else {
                cards.put(card, 1);
            }
        }

        Set<Long> keys = cards.keySet();
        int maxCnt = Integer.MIN_VALUE;
        long answer = Long.MAX_VALUE;
        for (long key : keys) {
            int value = cards.get(key);
            if (value > maxCnt) {
                maxCnt = value;
                answer = key;
            } else if (value == maxCnt & answer > key) {
                answer = key;
            }
        }
        System.out.println(answer);
    }
}
