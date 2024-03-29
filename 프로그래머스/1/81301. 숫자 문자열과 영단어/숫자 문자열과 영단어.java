class Solution {
    public int solution(String s) {
        String[] zeroToNine = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i <= 9; i++) {
            s = s.replaceAll(zeroToNine[i], i+"");
        }
        return Integer.parseInt(s);
    }
}