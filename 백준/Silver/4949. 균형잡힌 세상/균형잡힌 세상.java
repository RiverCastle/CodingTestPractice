import java.io.*;
import java.util.Stack;

public class Main {// 균형잡힌 세상 https://www.acmicpc.net/problem/4949

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = bufferedReader.readLine();
//        int test = 1;
        while (!line.equals(".")) {
            boolean done = false;
            String answer = "no\n";
//            bufferedWriter.write("test : " + test++ + "\n");
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < line.length(); i++) {
                Character value = line.charAt(i);
                if (value == '(' || value == '[') stack.push(value);
                else if (value == ')') {
                    if (stack.isEmpty()) break;
                    else if (stack.peek() == '(') stack.pop();
                    else break;
                }
                else if (value == ']') {
                    if (stack.isEmpty()) break;
                    else if (stack.peek() == '[') stack.pop();
                    else break;
                }
                else if (value == '.') {
                    done = true;
                    break;
                }
            }
            if (done && stack.isEmpty()) answer = "yes\n";
            bufferedWriter.write(answer);

            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
