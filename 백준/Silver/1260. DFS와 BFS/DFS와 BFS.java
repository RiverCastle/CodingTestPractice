import java.io.*;
import java.util.*;

public class Main {
    public static List<Integer> getBFSResult(int maxPoints, int edges, int startPoint, List<LinkedList<Integer>> adjList) throws IOException {

        for (int i = 0; i < adjList.size(); i++) {
            Collections.sort(adjList.get(i));
        }

        Queue<Integer> bfsQueue = new LinkedList<>();
        List<Integer> visitOrder = new ArrayList<>();
        boolean[] visitCheck = new boolean[maxPoints + 1];
        int next = startPoint;
        bfsQueue.offer(next);
        while (!bfsQueue.isEmpty()) {
            next = bfsQueue.poll();
            if (visitCheck[next]) continue; // 이미 방문했다면 다시 맨 앞으로

            visitCheck[next] = true;
            visitOrder.add(next);

            for (int i = 0; i < adjList.get(next).size(); i++) {
                int edgeInfo = adjList.get(next).get(i);
                if (!visitCheck[edgeInfo]) {
                    bfsQueue.offer(edgeInfo);
                }
            }
        }
        return visitOrder;
    }

    public static List<Integer> getDFSResult(int maxPoints, int edges, int startPoint, List<LinkedList<Integer>> adjList) throws IOException {

        for (int i = 0; i < adjList.size(); i++) {
            Collections.sort(adjList.get(i), Collections.reverseOrder());
        }


        Stack<Integer> dfsStack = new Stack<>();
        List<Integer> visitOrder = new ArrayList<>();
        boolean[] visitCheck = new boolean[maxPoints + 1];
        int next = startPoint;
        dfsStack.push(next);
        while (!dfsStack.isEmpty()) {
            next = dfsStack.pop();
            if (visitCheck[next]) continue; // 이미 방문했다면 다시 맨 앞으로

            visitCheck[next] = true;
            visitOrder.add(next);

            for (int i = 0; i < adjList.get(next).size(); i++) {
                int edgeInfo = adjList.get(next).get(i);
                if (!visitCheck[edgeInfo]) {
                    dfsStack.push(edgeInfo);
                }
            }
        }
        return visitOrder;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int maxPoints = Integer.parseInt(stringTokenizer.nextToken());
        int edges = Integer.parseInt(stringTokenizer.nextToken());
        int startPoint = Integer.parseInt(stringTokenizer.nextToken());

        List<LinkedList<Integer>> adjList = new ArrayList<>(maxPoints + 1);
        for (int i = 0; i < maxPoints + 1; i++) {
            adjList.add(new LinkedList<>());
        }

        for (int i = 0; i < edges; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int edgeStart = Integer.parseInt(stringTokenizer.nextToken());
            int edgeEnd = Integer.parseInt(stringTokenizer.nextToken());
            adjList.get(edgeStart).add(edgeEnd);
            adjList.get(edgeEnd).add(edgeStart);
        }
        bufferedReader.close();

        List<Integer> bfsResult = getBFSResult(maxPoints, edges, startPoint, adjList);
        List<Integer> dfsResult = getDFSResult(maxPoints, edges, startPoint, adjList);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int point : dfsResult) {
            bufferedWriter.write(point + " ");
        }
        bufferedWriter.write("\n");
        for (int point : bfsResult) {
            bufferedWriter.write(point + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
