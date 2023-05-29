class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        //1 <=  2 <  3 >=  4 >
        int operand = 0;
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                operand = 1;
            } else {    
                operand = 2;
            }
        } else if (eq.equals("=")) {
            operand = 3;
        } else {
            operand = 4;
        }
        
        switch(operand) {
            case 1:
                return n <= m ? 1 : 0;
            case 2:
                return n < m ? 1 : 0;
            case 3:
                return n >= m ? 1 : 0;
            default:
                return n > m ? 1 : 0;
        }
    }
}