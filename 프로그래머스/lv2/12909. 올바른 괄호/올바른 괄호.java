import java.util.Stack;

class Solution {
    boolean solution(String s) {
        int length = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            char present = s.charAt(i);
            if (present == '(') stack.push(present);
            if (present == ')') {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}