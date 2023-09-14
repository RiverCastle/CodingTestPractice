import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {// 연결 요소의 개수 https://www.acmicpc.net/problem/11724
    public static List<Integer>[] connections;
    public static boolean[] visited;

    public static void addConnection(int point1, int point2) {
        connections[point1].add(point2);
        connections[point2].add(point1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberN = Integer.parseInt(stringTokenizer.nextToken());
        int numberM = Integer.parseInt(stringTokenizer.nextToken());
        connections = new List[numberN + 1];
        visited = new boolean[numberN + 1];
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= numberN; i++) {
            connections[i] = new ArrayList<>();
            queue.add(i);
        }

        for (int i = 0; i < numberM; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int pointU = Integer.parseInt(stringTokenizer.nextToken());
            int pointV = Integer.parseInt(stringTokenizer.nextToken());
            addConnection(pointU, pointV);
        }
//        System.out.println(Arrays.toString(connections));
        int answer = 0;
        while (!queue.isEmpty()) {
            int present = queue.poll();
            if (!visited[present]) {
                answer++;
                visited[present] = true;
                Stack<Integer> nexts = new Stack<>();
                for (int connection : connections[present])
                    if (!visited[connection]) nexts.push(connection);
                while (!nexts.isEmpty()) {
                    present = nexts.pop();
                    if (!visited[present]) {
                        visited[present] = true;
                        for (int connection : connections[present])
                            if (!visited[connection]) nexts.push(connection);
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
