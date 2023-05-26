import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> integerStack = new Stack<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < caseNum; i++) {
            int money = Integer.parseInt(bufferedReader.readLine());
            if (money == 0) {
                integerStack.pop();
            } else {
                integerStack.push(money);
            }
        }
        int sum = 0;
        while (!integerStack.empty()) {
            sum += integerStack.pop();
        }
        System.out.println(sum);
    }
}