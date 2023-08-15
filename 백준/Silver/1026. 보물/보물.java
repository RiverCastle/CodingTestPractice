import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {// 보물 https://www.acmicpc.net/problem/1026

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> priorityQueueA = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueueB = new PriorityQueue<>(Collections.reverseOrder());

        StringTokenizer elementsToken = new StringTokenizer(bufferedReader.readLine());
        for (int j = 0; j < numberN; j++) {
            priorityQueueA.add(Integer.parseInt(elementsToken.nextToken()));
        }

        elementsToken = new StringTokenizer(bufferedReader.readLine());
        for (int j = 0; j < numberN; j++) {
            priorityQueueB.add(Integer.parseInt(elementsToken.nextToken()));
        }

        int answer = 0;
        for (int j = 0; j < numberN; j++) {
            answer += priorityQueueA.poll() * priorityQueueB.poll();
        }

        System.out.println(answer);

    }
}
