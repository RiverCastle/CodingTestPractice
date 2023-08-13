import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int numberN;
    public static int[][] paper;
    public static int[] answers;

    public static boolean judge(int start, int end, int size) {
        int value = paper[start][end];
        for (int i = start; i < start + size; i++) {
            for (int j = end; j < end + size; j++) {
                if (paper[i][j] != value) return false;
            }
        }
        return true;
    }

    public static void divideAndJudge(int start, int end, int size) {
        if (judge(start, end, size)) answers[paper[start][end]]++;
        else {
            int nextSize = size / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    divideAndJudge(start + nextSize * i, end + nextSize * j, nextSize);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        numberN = Integer.parseInt(bufferedReader.readLine());
        paper = new int[numberN][numberN];
        answers = new int[3];

        for (int i = 0; i < numberN; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < numberN; j++) {
                paper[i][j] = Integer.parseInt(stringTokenizer.nextToken()) + 1;
            }
        }
        divideAndJudge(0, 0, numberN);

        for (int answer : answers) {
            System.out.println(answer);
        }

    }
}
