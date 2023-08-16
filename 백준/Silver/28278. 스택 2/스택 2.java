import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {// 스택2 https://www.acmicpc.net/problem/28278
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int orders = Integer.parseInt(bufferedReader.readLine());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer orderToken;
        for (int i = 0; i < orders; i++) {
            orderToken = new StringTokenizer(bufferedReader.readLine());
            String order = orderToken.nextToken();
            if (order.equals("1")) stack.push(Integer.parseInt(orderToken.nextToken()));
            else if (order.equals("2")) {
                if (stack.empty()) bufferedWriter.write(-1 + "\n");
                else bufferedWriter.write(stack.pop() + "\n");
            } else if (order.equals("3")) bufferedWriter.write(stack.size() + "\n");
            else if (order.equals("4")) bufferedWriter.write(stack.empty() ? 1 + "\n" : 0 + "\n");
            else {
                if (stack.empty()) bufferedWriter.write(-1 + "\n");
                else bufferedWriter.write(stack.peek() + "\n");
            }
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
