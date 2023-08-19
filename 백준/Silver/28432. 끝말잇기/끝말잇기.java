import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {// 끝말잇기 예제 통과 https://www.acmicpc.net/problem/28432

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        List<String> logs = new ArrayList<>();

        int questionIdx = 0;
        for (int i = 0; i < numberN; i++) {
            String log = bufferedReader.readLine();
            logs.add(log);
            if (log.equals("?")) questionIdx = i;
        }

        int numberM = Integer.parseInt(bufferedReader.readLine());
        String[] candidates = new String[numberM];
        for (int i = 0; i < numberM; i++) {
            candidates[i] = bufferedReader.readLine();
        }
        if (numberN == 1) {
            System.out.println(candidates[0]);
        } else if (questionIdx != 0 && questionIdx != numberN - 1) {
            String preWord = logs.get(questionIdx - 1);
            String postWord = logs.get(questionIdx + 1);
            char start = preWord.charAt(preWord.length() - 1);
            char end = postWord.charAt(0);
            for (String candidate : candidates) {
                if (candidate.charAt(0) == start & candidate.charAt(candidate.length() - 1) == end & !logs.contains(candidate)) {
                    System.out.println(candidate);
                    break;
                }
            }
        } else if (questionIdx == 0) {
            String postWord = logs.get(questionIdx + 1);
            char end = postWord.charAt(0);
            for (String candidate : candidates) {
                if (candidate.charAt(candidate.length() - 1) == end & !logs.contains(candidate)) {
                    System.out.println(candidate);
                    break;
                }
            }
        } else {
            String preWord = logs.get(questionIdx - 1);
            char start = preWord.charAt(preWord.length() - 1);
            for (String candidate : candidates) {
                if (candidate.charAt(0) == start && !logs.contains(candidate)) {
                    System.out.println(candidate);
                    break;
                }
            }
        }
    }
}
