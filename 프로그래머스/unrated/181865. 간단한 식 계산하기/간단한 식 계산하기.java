class Solution {
    public int solution(String binomial) {
        String[] expression = binomial.split(" ");
        switch (expression[1]) {
            case "+":
                return Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]);
                
            case "-":
                return Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]);
                
            default:
                return Integer.parseInt(expression[0]) * Integer.parseInt(expression[2]);
                
        }
        
    }
}