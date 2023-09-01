import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {// 적록색약 예제 통과 https://www.acmicpc.net/problem/10026
    private static int numberN;
    private static int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private static String[] section;
    private static boolean[][] visited;
    public static boolean isValid(int tempY, int tempX) {
        return tempX >= 0 && tempY >= 0 && tempX < numberN && tempY < numberN;
    }
    public static void dfs(char color, int[] present, Stack<int[]> dfsStack) {
        for (int[] direction : directions) {
            int tempY = present[0] - direction[0];
            int tempX = present[1] - direction[1];
            if (isValid(tempY, tempX) && section[tempY].charAt(tempX) == color && !visited[tempY][tempX]) {
                dfsStack.push(new int[]{tempY, tempX});
            }
        }
    }
    public static void dfsForRG(int[] present, Stack<int[]> dfsStack) {
        for (int[] direction : directions) {
            int tempY = present[0] - direction[0];
            int tempX = present[1] - direction[1];
            if (isValid(tempY, tempX) && 'G' <= section[present[0]].charAt(present[1]) && section[present[0]].charAt(present[1]) <= 'R' && !visited[tempY][tempX]) {
                dfsStack.push(new int[]{tempY, tempX});
            }
        }
    }
    public static int countForRG(Queue<int[]> locations) {
        int answerTemp = 0;
        while (!locations.isEmpty()) {
            int[] present = locations.poll();
            if (!visited[present[0]][present[1]] && 'G' <= section[present[0]].charAt(present[1]) && section[present[0]].charAt(present[1]) <= 'R') {
                answerTemp++;
                visited[present[0]][present[1]] = true;
                Stack<int[]> dfsStack = new Stack<>();
                dfsForRG(present, dfsStack);
                while (!dfsStack.isEmpty()) {
                    present = dfsStack.pop();
                    if (!visited[present[0]][present[1]]) {
                        visited[present[0]][present[1]] = true;
                        dfsForRG(present, dfsStack);
                    }
                }
            }
        }
        return answerTemp;
    }
    public static int countSection(Queue<int[]> locations, char color) {
        int answerTemp = 0;
        while (!locations.isEmpty()) {
            int[] present = locations.poll();
            if (!visited[present[0]][present[1]] && section[present[0]].charAt(present[1]) == color) {
                answerTemp++;
                visited[present[0]][present[1]] = true;
                Stack<int[]> dfsStack = new Stack<>();
                dfs(color, present, dfsStack);
                while (!dfsStack.isEmpty()) {
                    present = dfsStack.pop();
                    if (!visited[present[0]][present[1]]) {
                        visited[present[0]][present[1]] = true;
                        dfs(color, present, dfsStack);
                    }
                }
            }
        }
        return answerTemp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        numberN = Integer.parseInt(bufferedReader.readLine());
        section = new String[numberN];
        visited = new boolean[numberN][numberN];
        Queue<int[]> rLocation = new ArrayDeque<>();
        Queue<int[]> gLocation = new ArrayDeque<>();
        Queue<int[]> bLocation = new ArrayDeque<>();
        Queue<int[]> rgLocation = new ArrayDeque<>();
        for (int i = 0; i < numberN; i++) {
            String line = bufferedReader.readLine();
            section[i] = line;
            int size = line.length();
            for (int j = 0; j < size; j++) {
                int[] location = new int[]{i, j};
                if (line.charAt(j) == 'R') {
                    rLocation.add(location);
                    rgLocation.add(location);
                }
                else if (line.charAt(j) == 'G') {
                    gLocation.add(location);
                    rgLocation.add(location);
                }
                else bLocation.add(location);
            }
        }
        int r = countSection(rLocation, 'R');
        int g = countSection(gLocation, 'G');
        int b = countSection(bLocation, 'B');
        visited = new boolean[numberN][numberN];
        int answerRG = countForRG(rgLocation);
        System.out.printf("%d %d", r+g+b, answerRG + b);
    }
}