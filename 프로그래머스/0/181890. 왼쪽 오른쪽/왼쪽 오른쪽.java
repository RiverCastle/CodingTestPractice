import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        int divisionIndex = -1;
        int direction = -1;

        for (int i = 0; i < str_list.length; i++) {
            String str = str_list[i];
            if (str.equals("l") || str.equals("r")) {
                divisionIndex = i;
                direction = str.equals("r") ? 1 : 0;
                break;
            }
        }
        String[] answer;
        if (direction == -1) return new String[0];
        else {
            if (direction == 0) {
                if (divisionIndex == 0) return new String[0];
                else {
                    answer = new String[divisionIndex];
                    for (int i = 0; i < answer.length; i++) {
                        answer[i] = str_list[i];
                    }
                    return answer;
                }
            } else {
                if (divisionIndex == str_list.length - 1) return new String[0];
                else {
                    answer = new String[str_list.length - divisionIndex - 1];
                    for (int i = 0; i < answer.length; i++) {
                        answer[i] = str_list[divisionIndex + 1 + i];
                    }
                    return answer;
                }
            }

        }
    }
}