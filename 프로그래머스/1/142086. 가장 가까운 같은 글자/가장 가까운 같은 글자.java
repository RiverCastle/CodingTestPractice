import java.util.*;

class Solution {
    private String word;
    private List<Integer> answer;
    public List<Integer> solution(String s) {
        word = s;
        answer = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            check(i);
//            System.out.println(answer);
//            System.out.println();
        }
        return answer;
    }

    private void check(int index) {
//        System.out.println("index = " + index);
        if (index == 0) {
            answer.add(-1);
            return;
        }
        else {
            String temp = word.substring(0, index);
//            System.out.println("temp = " + temp);
            for (int ci = index - 1; ci >= 0; ci--) { // ci = closest index
//                System.out.println("word = " + word.charAt(index));
//                System.out.println("temp = " + temp.charAt(ci));
                if (word.charAt(index) == temp.charAt(ci)) {
//                    System.out.println("ci = " + ci);
//                    System.out.println("equal");
                    answer.add(index - ci);
                    return;
                }
//                else {
//                    System.out.println("wrong");
//
//                }
            }
            answer.add(-1);
            return;
        }
    }
}