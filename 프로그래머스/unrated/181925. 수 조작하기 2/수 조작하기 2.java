class Solution {
    public String solution(int[] numLog) {
int length = numLog.length;
        int presentValue = numLog[0];
        String answer = "";

        for (int i = 1; i < length; i++) {
            int judge = numLog[i] - numLog[i - 1];

            switch (judge) {
                case 1 -> answer += "w";
                case -1 -> answer += "s";
                case 10 -> answer += "d";
                case -10 -> answer += "a";
            }
        }
        return answer;
    }
}