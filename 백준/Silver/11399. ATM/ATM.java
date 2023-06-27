import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int waitings = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < waitings; i++) {
            priorityQueue.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        int sum = 0;
        while (priorityQueue.size() > 0) {
            sum += priorityQueue.size() * priorityQueue.poll();
        }
        System.out.println(sum);
    }
}
