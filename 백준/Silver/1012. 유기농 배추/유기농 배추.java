import java.io.*;
import java.util.*;

public class Main {// 유기농 배추 https://www.acmicpc.net/problem/1012
    private static int numberN;
    private static int numberM;
    private static int numberK;
    private static int[][] farm;
    private static boolean[][] visited;
    private static int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private static boolean isValid(int locationY, int locationX) {
        return locationY >= 0 && locationY < numberN && locationX >= 0 && locationX < numberM;
    }

    private static void dfs(int[] present, Stack<int[]> dfsStack) {
        for (int[] direction : directions) {
            int tempY = present[0] - direction[0];
            int tempX = present[1] - direction[1];
            if (isValid(tempY, tempX) && !visited[tempY][tempX] && farm[tempY][tempX] == 1) {
//                visited[tempY][tempX] = true;
                dfsStack.push(new int[]{tempY, tempX});
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberT = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberT; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            numberM = Integer.parseInt(stringTokenizer.nextToken()); // X
            numberN = Integer.parseInt(stringTokenizer.nextToken()); // Y
            numberK = Integer.parseInt(stringTokenizer.nextToken());
            farm = new int[numberN][numberM];
            visited = new boolean[numberN][numberM];

            Queue<int[]> next = new ArrayDeque<>();
            for (int j = 0; j < numberK; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                int locationX = Integer.parseInt(stringTokenizer.nextToken());
                int locationY = Integer.parseInt(stringTokenizer.nextToken());
                farm[locationY][locationX] = 1;
                next.add(new int[]{locationY, locationX});
            }

//            System.out.println();
//            for (int j = 0; j < numberN; j++) {
//                System.out.println(Arrays.toString(farm[j]));
//            }

            int answer = 0;

            while (!next.isEmpty()) {
                int[] present = next.poll();
                if (!visited[present[0]][present[1]]) {
                    answer++;
                    visited[present[0]][present[1]] = true;
                    Stack<int[]> dfsStack = new Stack<>();
                    dfs(present, dfsStack);

                    while (!dfsStack.isEmpty()) {
                        present = dfsStack.pop();
                        if (!visited[present[0]][present[1]]) {
                            visited[present[0]][present[1]] = true;
                            dfs(present, dfsStack);
                        }
                    }
                }
            }
            bufferedWriter.write(answer + "\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
