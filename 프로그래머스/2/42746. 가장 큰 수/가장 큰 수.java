import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] numbersStr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            numbersStr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numbersStr, (number1, number2) -> (number2 + number1).compareTo(number1 + number2));

        StringBuilder sb = new StringBuilder();
        for (String number : numbersStr) sb.append(number);
        String answer = sb.toString();
        
        return answer.charAt(0)=='0' ? "0" : answer;
    }
}