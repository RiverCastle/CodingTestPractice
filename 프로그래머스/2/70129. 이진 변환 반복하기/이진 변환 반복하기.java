class Solution {
    public int[] solution(String s) {
        int count = 0;
        int deleteZero = 0;
        while (!s.equals("1")) {
            int lengthOfS = s.length();
            int countZero = 0;
            for (int i = 0; i < lengthOfS; i++) {
                if (s.charAt(i) == '0') countZero++;
            }
            
            s = Integer.toBinaryString(lengthOfS - countZero);
            deleteZero += countZero;
            count++;
        }
        int[] answer = {count, deleteZero};
        return answer;
    }
}