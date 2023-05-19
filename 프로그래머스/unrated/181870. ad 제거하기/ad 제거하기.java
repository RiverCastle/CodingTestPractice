class Solution {
    public String[] solution(String[] strArr) {
        String answer = "";
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answer += strArr[i] + " ";
            }
        }
        return answer.trim().split(" ");
    }
}