class Solution {
    public String solution(String rny_string) {
        String[] my_stringArr = rny_string.split("");
        String answer = "";
        for (String character : my_stringArr) {
            if (character.equals("m")) {
                character = "rn";
            }
            answer += character;
        }
        return answer;
    }
}