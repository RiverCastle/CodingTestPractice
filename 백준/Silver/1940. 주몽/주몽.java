import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 주몽 https://www.acmicpc.net/problem/1940

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        int numberM = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] ingredients = new int[numberN];
        for (int i = 0; i < numberN; i++) ingredients[i] = Integer.parseInt(stringTokenizer.nextToken());

        int answer = 0;
        for (int start = 0; start < numberN - 1; start++) {
            int end = start + 1;
            while (end < numberN) {
                if (numberM == ingredients[start] + ingredients[end]) {
                    answer++;
                    break;
                }
                else end++;
            }
        }
        System.out.println(answer);
    }
}
