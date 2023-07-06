import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long numberA = Long.parseLong(stringTokenizer.nextToken());
        long numberB = Long.parseLong(stringTokenizer.nextToken());

        int cnt = 0;
        Queue<Long> queue = new LinkedList<>();
        queue.add(numberA);
        boolean found = false;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                long number = queue.poll();
                if (number == numberB) {
                    found = true;
                    break;
                } else if (number < numberB) {
                    queue.add(2 * number);
                    queue.add(number * 10 + 1);
                } else continue;
            }
            cnt++;
            if (found) break;
        }
        if (found) System.out.println(cnt);
        else System.out.println(-1);
    }
}
