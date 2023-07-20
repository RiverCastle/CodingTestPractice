import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public boolean inTheBox(int y, int x, int numberN, int numberM) {
        return 0 <= y && y < numberN && 0 <= x && x < numberM;
    }

    public int Solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberM = Integer.parseInt(stringTokenizer.nextToken());
        int numberN = Integer.parseInt(stringTokenizer.nextToken());

        int[][] box = new int[numberN][numberM];

        Queue<int[]> queue = new LinkedList<>(); // 익은 토마토를 넣을 큐
        for (int i = 0; i < numberN; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < numberM; j++) {
                box[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (box[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int day = 0;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                int[] riped = queue.poll();
                int y = riped[0];
                int x = riped[1];

                if (inTheBox(y, x - 1, numberN, numberM) && box[y][x - 1] == 0) { // 왼쪽
                    box[y][x - 1] = 1;
                    queue.offer(new int[]{y, x - 1});
                }
                if (inTheBox(y, x + 1, numberN, numberM) && box[y][x + 1] == 0) { // 오른쪽
                    box[y][x + 1] = 1;
                    queue.offer(new int[]{y, x + 1});
                }
                if (inTheBox(y - 1, x, numberN, numberM) && box[y - 1][x] == 0) { // 위
                    box[y - 1][x] = 1;
                    queue.offer(new int[]{y - 1, x});
                }
                if (inTheBox(y + 1, x, numberN, numberM) && box[y + 1][x] == 0) {// 아래
                    box[y + 1][x] = 1;
                    queue.offer(new int[]{y + 1, x});
                }
            }
            day++;
        }
        for (int i = 0; i < numberN; i++) {
            for (int j = 0; j < numberM; j++) {
                if (box[i][j] == 0) return -1;
            }
        }
        return day - 1;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Main().Solution());
    }
}
