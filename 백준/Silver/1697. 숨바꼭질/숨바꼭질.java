import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {// 숨박꼭질 https://www.acmicpc.net/problem/1697

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int numberN = Integer.parseInt(stringTokenizer.nextToken());
        int numberM = Integer.parseInt(stringTokenizer.nextToken());

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(numberM);
        Map<Integer, Boolean> exist = new HashMap<>();
        int answer = 0;

        while (!queue.contains(numberN)) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int present = queue.poll();
                if (!exist.containsKey(present)) {
                    if (present % 2 == 0) queue.add(present / 2);
                    queue.add(present + 1);
                    queue.add(present - 1);
                    exist.put(present, true);
                }
            }
            answer++;
        }

        System.out.println(answer);
    }
}
