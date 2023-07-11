import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {// 조이스틱 96.3점
    // https://school.programmers.co.kr/learn/courses/30/lessons/42860
    private static int[] arr = new int[3];

    public int changeToTarget(String name) {
        int answer = 0;
        for (int i = 0; i < name.length(); i++) {
            int target = name.charAt(i);
            if (target > 78) {
                answer += 1 + 'Z' - target;
            } else {
                answer += target - 'A';
            }
        }
        return answer;
    }
    public int makeARightDirection(String name) {
        int answer = 0;
        String[] targetArr = "A".repeat(name.length()).split("");
        String[] nameArr = name.split("");
        nameArr[0] = "A";


        while (!Arrays.equals(nameArr, targetArr)) {
            nameArr[answer + 1] = "A";
            answer++;
        }
        return answer;
    }

    public int makeALeftDirection(String name, boolean jump) {
        String[] nameArr = name.split("");
        String[] targetArr = "A".repeat(name.length()).split("");
        if (!jump) nameArr[0] = "A";

        int answer = 0;
        while (!Arrays.equals(nameArr, targetArr)) {
            answer++;
            nameArr[nameArr.length - answer] = "A";
        }
        return answer;
    }

    public int makeAReturn(String name) {
        if (!name.contains("A")) return 9999;
        List<Integer> answerList = new ArrayList<>();
        int maxConsequetialLength = 1;
        for (int i = name.length(); i >= 0; i--) {
            if (name.contains("A".repeat(i))) {
                maxConsequetialLength = i;
                break;
            }
        }
        String target = "A".repeat(maxConsequetialLength);
        if (name.equals(target)) return 0;
        int index = name.indexOf(target);
        answerList.add(2 * (index - 1) + name.length() - index - maxConsequetialLength);
        answerList.add(2 * (name.length() - index - maxConsequetialLength) + index - 1);


        while (index != name.indexOf(target, index + 1)) {
            index = name.indexOf(target, index + 1);
            if (index == -1) break;
            answerList.add(2 * (index - 1) + name.length() - index - maxConsequetialLength);
            answerList.add(2 * (name.length() - index - maxConsequetialLength) + index - 1);
        }

        int answer = Integer.MAX_VALUE;
        for (int value : answerList) {
            if (value < answer) answer = value;
        }

        return answer;
    }

//    public int solution(String name) {
//        if (name.length() == 1) {
//            return changeToTarget(name);
//        } else {
//            arr[0] = makeARightDirection(name);
//            arr[1] = makeALeftDirection(name, false);
//            makeAReturn(name);
//            makeAReturn(name);
//
//            int min = Integer.MAX_VALUE;
//            for (int value : arr) {
//                if (value < min) {
//                    min = value;
//                }
//            }
//            return min + changeToTarget(name);
//        }
//    }


    public int solution(String name) {
        if (name.length() == 1) {
            return changeToTarget(name);
        } else {
            arr[0] = makeARightDirection(name);
            arr[1] = makeALeftDirection(name, false);
            arr[2] = makeAReturn(name);
            makeAReturn(name);

            int min = Integer.MAX_VALUE;
            for (int value : arr) {
                if (value < min) {
                    min = value;
                }
            }
            return min + changeToTarget(name);
        }
    }

}