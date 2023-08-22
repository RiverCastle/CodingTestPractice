
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 수 이어 쓰기 1 https://www.acmicpc.net/problem/1748
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        int numberN = Integer.parseInt(line);
        int answer = 0;
        for (int i = 0; i < line.length() - 1; i++) {
            int start = (int) Math.pow(10, i);
            int end = (int) Math.pow(10, i + 1);
            answer += (i + 1) * (end - start);
//            System.out.printf("answer = %d = %d * %d \n", (i + 1) * (end - start), i + 1, end - start);
        }

        answer += (numberN - (int) Math.pow(10, line.length() - 1) + 1) * line.length();

        System.out.println(answer);
    }
}
