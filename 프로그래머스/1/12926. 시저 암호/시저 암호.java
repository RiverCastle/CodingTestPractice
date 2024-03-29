class Solution {
    private String answer;
    public String solution(String s, int n) {
        answer = "";
        for (int i = 0; i < s.length(); i++) {
            makeCaesarCipher(s.charAt(i), n);
        }
        return answer;
    }

    private void makeCaesarCipher(char c, int n) {
        if (c >= 'a' & c <= 'z' & c + n > 'z')
            c = (char) (c + n - 'z' + 'a' - 1);
        else if (c >= 'A' & c <= 'Z' & c + n >'Z')
            c = (char) (c + n - 'Z' + 'A' - 1);
        else if (c != ' ') c = (char) (c + n);

        answer += c;
    }
}