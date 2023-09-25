
import java.io.*;
import java.util.*;

public class Main {// 알고리즘 수업 - 너비 우선 탐색 1 https://www.acmicpc.net/problem/24444
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberN = Integer.parseInt(stringTokenizer.nextToken());
        int numberM = Integer.parseInt(stringTokenizer.nextToken());
        int numberR = Integer.parseInt(stringTokenizer.nextToken());
        List<Integer>[] connections = new List[numberN + 1];
        for (int i = 0; i <= numberN; i++) connections[i] = new ArrayList<>();
        for (int i = 0; i < numberM; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            connections[start].add(end);
            connections[end].add(start);
        }
        bufferedReader.close();

        for(List<Integer> connection : connections)
            Collections.sort(connection);
//            System.out.println("connection = " + connection);

        boolean[] visited = new boolean[numberN + 1];
        Queue<Integer> next = new ArrayDeque<>();
        next.add(numberR);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] answer = new int[numberN + 1];
        int cnt = 1;
        while (!next.isEmpty()) {
            int present = next.poll();
            if (!visited[present]) {
                answer[present] = cnt++;
                visited[present] = true;
                for (int connected : connections[present]) next.add(connected);
            }
        }

        for (int start = 1; start <= numberN; start++)
            if (!visited[start]) bufferedWriter.write(0 + "\n");
        else bufferedWriter.write(answer[start] + " \n");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
