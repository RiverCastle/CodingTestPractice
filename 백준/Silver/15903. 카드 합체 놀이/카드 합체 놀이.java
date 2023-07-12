import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int cardsSize = Integer.parseInt(stringTokenizer.nextToken());
        int combinationCnt = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        PriorityQueue<Long> cardsQueue = new PriorityQueue();
        for (int i = 0; i < cardsSize; i++) {
            cardsQueue.add(Long.parseLong(stringTokenizer.nextToken()));
        }

        for (int i = 0; i < combinationCnt; i++) {
            long temp = cardsQueue.poll() + cardsQueue.poll();
            cardsQueue.add(temp);
            cardsQueue.add(temp);
        }

        long answer = 0;
        while (!cardsQueue.isEmpty()) {
            answer += cardsQueue.poll();
        }
        System.out.println(answer);
    }
}
