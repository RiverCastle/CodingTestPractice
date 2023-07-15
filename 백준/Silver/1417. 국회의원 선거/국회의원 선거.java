import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int candidates = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> votes = new PriorityQueue<>(Collections.reverseOrder());
        int dasom = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i < candidates; i++) {
            votes.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int cnt = 0;

        while (!votes.isEmpty() && dasom <= votes.peek()) {
            cnt++;
            dasom++;
            votes.add(votes.poll() - 1);
        }
        System.out.println(cnt);

    }
}
