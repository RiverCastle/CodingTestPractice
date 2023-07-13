import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {// N번째 큰 수 예제 완료
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < numberN; i++) {
            StringTokenizer numberTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < numberN; j++) {
                integerPriorityQueue.add(Integer.parseInt(numberTokenizer.nextToken()));
            }
        }
        for (int i = 0; i < numberN - 1; i++) {
            integerPriorityQueue.poll();
        }
        System.out.println(integerPriorityQueue.poll());
    }
}