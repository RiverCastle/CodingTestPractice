import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {// 큐
    private static int lastElement;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int numberN = Integer.parseInt(bufferedReader.readLine());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numberN; i++) {
            String command = bufferedReader.readLine();
            if (command.startsWith("push")) {
                lastElement = Integer.parseInt(command.split(" ")[1]);
                queue.add(lastElement);
            }
            else if (command.equals("pop")) {
                if (queue.size() == 0) bufferedWriter.write("-1\n");
                else bufferedWriter.write(queue.poll() + "\n");
            }
            else if (command.equals("size")) {
                bufferedWriter.write(queue.size() + "\n");
            }
            else if (command.equals("empty")) {
                if (queue.isEmpty()) bufferedWriter.write(1 + "\n");
                else bufferedWriter.write(0 + "\n");
            }
            else if (command.equals("front")) {
                if (queue.size() == 0) bufferedWriter.write("-1\n");
                else bufferedWriter.write(queue.peek() + "\n");
            }
            else {
                if (queue.size() == 0) bufferedWriter.write("-1\n");
                else bufferedWriter.write(lastElement + "\n");
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
