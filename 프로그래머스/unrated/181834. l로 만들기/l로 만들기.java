class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char character = myString.charAt(i);
            if (character < 'l') {
                answer += "l";
            } else {
                answer += character;
            }
        }
        return answer;
    }
}