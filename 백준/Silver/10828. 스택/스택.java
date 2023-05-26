import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> intStack = new Stack<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        for (int i = 0; i < testNum; i++) {
            String line = bufferedReader.readLine();
            if (line.contains(" ")) {
                stringTokenizer = new StringTokenizer(line);
                if (stringTokenizer.nextToken().equals("push")) {
                    intStack.push(Integer.parseInt(stringTokenizer.nextToken()));
                }
            } else if (line.equals("pop")) {
                if (intStack.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(intStack.pop());
                }
            } else if (line.equals("size")) {
                System.out.println(intStack.size());
            } else if (line.equals("empty")) {
                System.out.println(intStack.isEmpty() ? 1 : 0);
            } else if (line.equals("top")) {
                if (intStack.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(intStack.peek());
                }
            }
        }
    }
}