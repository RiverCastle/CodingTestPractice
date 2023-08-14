
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 아주 간단한 문제 https://www.acmicpc.net/problem/25375
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());
        for (int k = 0; k < tests; k++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            long numberA = Long.parseLong(stringTokenizer.nextToken());
            long numberB = Long.parseLong(stringTokenizer.nextToken());
            if (numberA * 2 <= numberB && numberB % numberA == 0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
