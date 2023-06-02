import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int period = scanner.nextInt();

        Queue<Integer> queue = new ArrayDeque();
        for (int i = 1; i <= people; i++) {
            queue.add(i);
        }

        int[] answer = new int[people];
        int idx = 0;
        while (queue.size() != 1) {
            for (int i = 1; i < period; i++) {
                queue.add(queue.poll());
            }
            answer[idx++] = (int) queue.poll();
        }
        answer[idx] = (int) queue.poll();


        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write("<");
        for (int i = 0; i < answer.length - 1; i++) {
            bufferedWriter.write(answer[i] + ", ");
        }
        bufferedWriter.write(answer[answer.length - 1] + ">");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}