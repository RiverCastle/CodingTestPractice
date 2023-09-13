import java.io.*;
import java.util.*;

public class Main {// 단지번호붙이기 https://www.acmicpc.net/problem/2667

    private static int numberN;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private static boolean isValid(int y, int x) {
        return y >= 0 && y < numberN && x >= 0 && x < numberN;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        numberN = Integer.parseInt(bufferedReader.readLine());
        map = new int[numberN][numberN];
        visited = new boolean[numberN][numberN];
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < numberN; i++) {
            String[] line = bufferedReader.readLine().split("");
            for (int j = 0; j < numberN; j++) {
                int value = Integer.parseInt(line[j]);
                map[i][j] = value;
                if (value == 1) queue.add(new int[]{i, j});
            }
        }
        bufferedReader.close();

        List<Integer> answers = new ArrayList<>();
        while (!queue.isEmpty()) {
            int[] present = queue.poll();
            if (!visited[present[0]][present[1]]) {
                visited[present[0]][present[1]] = true;
                int cnt = 1;
                Stack<int[]> next = new Stack<>();
                for (int[] direction : directions) {
                    int y = present[0] - direction[0];
                    int x = present[1] - direction[1];
                    if (isValid(y, x) && !visited[y][x] && map[y][x] == 1) next.push(new int[]{y, x});
                }
                while (!next.isEmpty()) {
                    present = next.pop();
                    if (!visited[present[0]][present[1]]) {
                        cnt++;
                        visited[present[0]][present[1]] = true;
                        for (int[] direction : directions) {
                            int y = present[0] - direction[0];
                            int x = present[1] - direction[1];
                            if (isValid(y, x) && !visited[y][x] && map[y][x] == 1) next.push(new int[]{y, x});
                        }
                    }
                }
                answers.add(cnt);
            }
        }
        Collections.sort(answers);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(answers.size() + "\n");
        for (int answer : answers) {
            bufferedWriter.write(answer + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
