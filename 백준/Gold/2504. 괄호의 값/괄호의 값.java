import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputValue = bufferedReader.readLine();

        boolean success = true;
        int muliple = 1;
        int result = 0;
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < inputValue.length(); i++) {
            switch (inputValue.charAt(i)) {
                case '(':
                    stack.push('(');
                    muliple *= 2;
                    break;
                    
                case '[':
                    stack.push('[');
                    muliple *= 3;
                    break;
                    
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        success = false;
                        break;
                    }
                    if (inputValue.charAt(i - 1) == '(') result += muliple;
                    stack.pop();
                    muliple /= 2;
                    break;
                    
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        success = false;
                        break;
                    }
                    if (inputValue.charAt(i - 1) == '[') result += muliple;
                    stack.pop();
                    muliple /= 3;
                    break;
                    
                default:
                    success = false;
                    break;
            }
        }
        
        if (!success || !stack.isEmpty()) {
            bufferedWriter.write(0 + "\n");
        } else {
            bufferedWriter.write(result + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}