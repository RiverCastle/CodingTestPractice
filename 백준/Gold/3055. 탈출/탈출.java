import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {// 탈출 
    private static int[] startPoint;
    private static int[] endPoint;
    private static Character[][] map;
    private static int mapHeight;
    private static int mapWidth;


    private static boolean inTheMap(int y, int x) {
        return 0 <= y & y < mapHeight & 0 <= x & x < mapWidth;
    }

    private static int[][] directions = new int[][]{
            {-1 , 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer mapTokens = new StringTokenizer(bufferedReader.readLine());
        mapHeight = Integer.parseInt(mapTokens.nextToken());
        mapWidth = Integer.parseInt(mapTokens.nextToken());

        map = new Character[mapHeight][mapWidth];
        Queue<int[]> nextMove = new ArrayDeque<>();
        Queue<int[]> nextFlood = new ArrayDeque<>();
        boolean[][] visited = new boolean[mapHeight][mapWidth];

        for (int i = 0; i < mapHeight; i++) {
            String mapInfo = bufferedReader.readLine();
            for (int j = 0; j < mapWidth; j++) {
                map[i][j] = mapInfo.charAt(j);
                if (map[i][j].equals('S')) nextMove.offer(new int[]{i, j});
                if (map[i][j].equals('D')) endPoint = new int[]{i, j};
                if (map[i][j].equals('*')) nextFlood.add(new int[]{i, j});
            }
        }
        boolean arrival = false;
        int day = 0;
        while (!arrival) {
            day++;

            Queue<int[]> thisFlood = nextFlood;
            nextFlood = new ArrayDeque<>();
            while (!thisFlood.isEmpty()) {
                int[] present = thisFlood.poll();
                for (int[] direction : directions) {
                    int nextY = present[0] - direction[0];
                    int nextX = present[1] - direction[1];
                    if (inTheMap(nextY, nextX) && (map[nextY][nextX] == '.' || map[nextY][nextX] == 'S')) {
                        map[nextY][nextX] = '*';
                        nextFlood.add(new int[]{nextY, nextX});
                    }
                }
            }

            Queue<int[]> thisMove = nextMove;
            nextMove = new ArrayDeque<>();
            while (!thisMove.isEmpty()) {
                int[] now = thisMove.poll();
                for (int[] direction : directions) {
                    int nextY = now[0] - direction[0];
                    int nextX = now[1] - direction[1];
                    if (inTheMap(nextY, nextX) && !visited[nextY][nextX]) {
                        if (map[nextY][nextX] == '.') {
                            visited[nextY][nextX] = true;
                            nextMove.add(new int[]{nextY, nextX});
                        }
                        else if (map[nextY][nextX] == 'D') {
                            arrival = true;
                            break;
                        }
                    }
                }
                if (arrival) break;
            }
            if (nextMove.isEmpty()) break;
        }

        if (arrival) System.out.println(day);
        else System.out.println("KAKTUS");
    }
}
