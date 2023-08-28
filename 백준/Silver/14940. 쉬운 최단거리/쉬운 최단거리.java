
import java.io.*;
import java.util.*;

public class Main {// 쉬운 최단거리 https://www.acmicpc.net/problem/14940
    private static int numberN;
    private static int numberM;

    public static boolean isValid(int[] location) {
        return location[0] >= 0 && location[0] < numberN && location[1] >= 0 && location[1] < numberM;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        numberN = Integer.parseInt(stringTokenizer.nextToken());
        numberM = Integer.parseInt(stringTokenizer.nextToken());

        int startY = 0;
        int startX = 0;

        int[][] map = new int[numberN][numberM];
        boolean[][] visited = new boolean[numberN][numberM];

        for (int i = 0; i < numberN; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < numberM; j++) {
                map[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (map[i][j] == 2) {
                    startY = i;
                    startX = j;
                }
            }
//            System.out.println(Arrays.toString(map[i]));
        }
        bufferedReader.close();

        Queue<int[]> nexts = new ArrayDeque<>();
        int distance = 1;
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        map[startY][startX] = 0;
        visited[startY][startX] = true;
        nexts.add(new int[]{startY, startX});
        while (!nexts.isEmpty()) {
//            System.out.println("distance = " + distance);
            int size = nexts.size();
            for (int i = 0; i < size; i++) {
                int[] present = nexts.poll();
                for (int[] direction : directions) {
                    int[] next = {present[0] - direction[0], present[1] - direction[1]};
                    if (isValid(next) && map[next[0]][next[1]] == 1 && !visited[next[0]][next[1]]) {
                        map[next[0]][next[1]] = distance;
                        visited[next[0]][next[1]] = true;
                        nexts.offer(next);
                    }
                }
            }
            distance++;
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numberN; i++) {
            for (int j = 0; j < numberM; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    map[i][j] = -1;
                }
                bufferedWriter.write(map[i][j] + " ");
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
