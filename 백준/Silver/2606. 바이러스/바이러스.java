import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(bufferedReader.readLine());
        int edges = Integer.parseInt(bufferedReader.readLine());
        List<LinkedList<Integer>> networkInfo = new ArrayList<>(computers + 1);
        for (int i = 0; i <= computers; i++) {
            networkInfo.add(new LinkedList<>());
        }

        for (int i = 0; i < edges; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int startPoint = Integer.parseInt(stringTokenizer.nextToken());
            int endPoint = Integer.parseInt(stringTokenizer.nextToken());
            networkInfo.get(startPoint).add(endPoint);
            networkInfo.get(endPoint).add(startPoint);

        }

        boolean[] visit = new boolean[computers + 1];
        Stack<Integer> dfsStack = new Stack<>();
        for (int edgeInfo : networkInfo.get(1)) {
            dfsStack.push(edgeInfo);
        }
        visit[1] = true;

        while (!dfsStack.isEmpty()) {
            int next = dfsStack.pop();
            if (visit[next]) continue;

            visit[next] = true;
            for (int edgeInfo : networkInfo.get(next)) {
                dfsStack.push(edgeInfo);
            }
        }
        int affected = 0;
        for (boolean virus : visit) {
            if (virus) affected += 1;
        }
        System.out.println(affected - 1);

    }
}
