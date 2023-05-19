class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] numbers = number.split("");
        for (String numberElement : numbers) {
            answer += Integer.parseInt(numberElement);
        }
        return answer % 9;
    }
}