
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int commandsNumber = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < commandsNumber; i++) {
            String command = br.readLine();
            if (command.startsWith("push_front")) {
                String[] inputs = command.split(" ");
                deque.addFirst(Integer.parseInt(inputs[1]));
            } else if (command.startsWith("push_back")) {
                String[] inputs = command.split(" ");
                deque.addLast(Integer.parseInt(inputs[1]));
            } else if (command.startsWith("pop_front")) {
                if (deque.size() > 0) bw.write(deque.pollFirst() + "\n");
                else bw.write("-1\n");
            } else if (command.startsWith("pop_back")) {
                if (deque.size() > 0) bw.write(deque.pollLast() + "\n");
                else bw.write("-1\n");
            } else if (command.startsWith("size")) {
                bw.write(deque.size() + "\n");
            } else if (command.startsWith("empty")) {
                bw.write(deque.isEmpty() ? "1\n" : "0\n");
            } else if (command.startsWith("front")) {
                bw.write(deque.isEmpty() ? "-1\n" : deque.getFirst() + "\n");
            } else if (command.startsWith("back")) {
                bw.write(deque.isEmpty() ? "-1\n" : deque.getLast() + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }

}
