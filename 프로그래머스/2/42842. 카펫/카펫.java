class Solution {
    public int[] solution(int brown, int yellow) {
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i != 0) continue;

            int yellowShort = i;
            int yellowLong = yellow / i;

            if (brown == (yellowLong + 2) * (yellowShort + 2) - yellow) {;
                return new int[] {yellowLong + 2, yellowShort + 2};
            }
        }
        
        return new int[] {0, 0};
    }
}