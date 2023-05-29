import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String myStr) {
        String[] splitters = new String[] {"a", "b", "c"};

        for (String splitter : splitters) {
            myStr = myStr.replaceAll(splitter, " ");
        }

        String[] splitted = myStr.split(" ");

        List<String> answer = new ArrayList<>();
        
        for (String element : splitted) {
            if (!element.equals("")) {
                answer.add(element);
            }
        }
        if (answer.size() == 0) {
            answer.add("EMPTY");
        }
        
        return answer;
    }
}