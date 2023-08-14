import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {// 가운데를 말해요 https://www.acmicpc.net/problem/1655
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < numberN; i++) {
            int value = Integer.parseInt(bufferedReader.readLine());
            if (min.size() == max.size()) {
                max.add(value);
                if (!min.isEmpty()) {
                    if (min.peek() < max.peek()) {
                        min.add(max.poll());
                        max.add(min.poll());
                    }
                }
            } else {
                min.add(value);
                if (min.peek() < max.peek()) {
                    min.add(max.poll());
                    max.add(min.poll());
                }
            }
            bufferedWriter.write(max.peek() + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
