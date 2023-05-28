class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int lengthMyString = myString.length();
        int lengthPat = pat.length();
        for (int i = 0; i <= lengthMyString - lengthPat; i++) {
            if (myString.substring(i, i + lengthPat).equals(pat)) {
                answer += 1;
            }
        }
        return answer;
    }
}
