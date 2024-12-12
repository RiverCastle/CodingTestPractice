import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int numberN = Integer.parseInt(br.readLine());
        String inputs = br.readLine();
        StringTokenizer st = new StringTokenizer(inputs);
        Queue<Integer> waiting = new LinkedList<>();
        for (int i = 0; i < numberN; i++) {
            waiting.add(Integer.parseInt(st.nextToken()));
        }

        int order = 1;
        Stack<Integer> resting = new Stack<>();
        boolean completed = false;
        while (!completed) {
            int waitingFirst = waiting.isEmpty() ? 0 : waiting.peek();
            int restingFirst = resting.isEmpty() ? 0 : resting.peek();

            if (order == waitingFirst) {
                waiting.poll();
                order++;
            } else if (order == restingFirst) {
                resting.pop();
                order++;
            } else if (resting.isEmpty() || (restingFirst > waitingFirst)) {
                resting.push(waiting.poll());
            }
            else break;
            if (waiting.isEmpty() & resting.isEmpty()) completed = true;
        }


        if (waiting.isEmpty() & resting.isEmpty())
            bw.write("Nice");
        else
            bw.write("Sad");
        bw.flush();
    }
}
