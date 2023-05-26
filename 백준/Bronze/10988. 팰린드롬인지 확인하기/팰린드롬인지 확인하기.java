import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stackStr = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String[] alphabets = word.split("");

        for (String alphabet : alphabets) {
            stackStr.push(alphabet);
        }
        
        String answer = "";
        while (!stackStr.empty()) {
            answer += stackStr.pop();
        }

        System.out.println(answer.equals(word) ? 1 : 0);
    }
}