import java.io.*;
import java.util.*;

public class Main {// 트리의 부모찾기
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int nodes = Integer.parseInt(bufferedReader.readLine());
        int[] roots = new int[nodes + 1];
        boolean[] visited = new boolean[nodes + 1];
        visited[1] = false;
        ArrayList<Integer>[] linkInfos = new ArrayList[nodes + 1];
        for (int i = 0; i < nodes + 1; i++) {
            linkInfos[i] = new ArrayList<>();
        }

        for (int i = 0; i < nodes - 1; i++) {
            StringTokenizer nodesTokenizer = new StringTokenizer(bufferedReader.readLine());
            int node1 = Integer.parseInt(nodesTokenizer.nextToken());
            int node2 = Integer.parseInt(nodesTokenizer.nextToken());
            linkInfos[node1].add(node2);
            linkInfos[node2].add(node1);
            }
        bufferedReader.close();

        Queue<Integer> queue = new LinkedList();
        queue.add(1);
        while (!queue.isEmpty()) {
            int next = queue.poll();
            visited[next] = true;
            for (int child : linkInfos[next]) {
                if (!visited[child]) {
                    roots[child] = next;
                    queue.add(child);
                }
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 2; i < roots.length; i++) {
            bufferedWriter.write(roots[i] + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
