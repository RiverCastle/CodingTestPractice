import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < numberN; i++) {
            priorityQueue.offer(Integer.parseInt(bufferedReader.readLine()));
        }

        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numberN; i++) {
            bufferedWriter.write(priorityQueue.poll() + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
