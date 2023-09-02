import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {// 미로 탐색 https://www.acmicpc.net/problem/2178
    private static int numberN;
    private static int numberM;
    private static int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    private static boolean isValid(int locationY, int locationX) {
        return locationY >= 0 && locationX >= 0 && locationY < numberN && locationX < numberM;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        numberN = Integer.parseInt(stringTokenizer.nextToken());
        numberM = Integer.parseInt(stringTokenizer.nextToken());

        String[] map = new String[numberN];
        for (int i = 0; i < numberN; i++) {
            map[i] = bufferedReader.readLine();
        }
        Queue<int[]> presents = new ArrayDeque<>();
        presents.add(new int[]{0, 0});
        boolean[][] visited = new boolean[numberN][numberM];
        visited[0][0] = true;
        int cnt = 1;
        while (!visited[numberN - 1][numberM - 1]) {
            cnt++;
            int size = presents.size();
            for (int i = 0; i < size; i++) {
                int[] present = presents.poll();
                for (int[] direction : directions) {
                    int nextY = present[0] - direction[0];
                    int nextX = present[1] - direction[1];
                    if (isValid(nextY, nextX) && !visited[nextY][nextX] && map[nextY].charAt(nextX) == '1') {
                        visited[nextY][nextX] = true;
                        presents.add(new int[]{nextY, nextX});

                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
