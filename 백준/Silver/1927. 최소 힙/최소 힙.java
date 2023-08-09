import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int time = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < time; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            if (num == 0) {
                if (minHeap.size() == 0) {
                    bufferedWriter.write(0 + "\n");
                } else {
                    bufferedWriter.write(minHeap.poll() + "\n");
                }
            } else {
                minHeap.add(num);
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
