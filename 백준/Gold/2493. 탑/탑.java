import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int numberN = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        Stack<int[]> stack = new Stack();
        for (int i = 1; i <= numberN; i++) {
            int tower = Integer.parseInt(stringTokenizer.nextToken());
            while (!stack.isEmpty() && stack.peek()[1] < tower) {
                stack.pop();
            }
            int answer = stack.isEmpty() ? 0 : stack.peek()[0];
            stack.push(new int[] {i, tower});
            bw.write(answer + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
