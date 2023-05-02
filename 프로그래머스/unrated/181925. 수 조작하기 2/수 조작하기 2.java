class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i=0; i<numLog.length-1;i++) {
            int a = numLog[i+1] - numLog[i];
            if (a > 1) answer += "d";
            else if (a == 1) answer += "w";
            else if (a < -1) answer += "a";
            else answer += "s";
        }
        return answer;
    }
}