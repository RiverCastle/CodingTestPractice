import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int numberA = Integer.parseInt(stringTokenizer.nextToken());
        int numberB = Integer.parseInt(stringTokenizer.nextToken());
        int numberN = Integer.parseInt(stringTokenizer.nextToken());

        int remains = numberA % numberB;
        int answer = numberA / numberB;
        for (int i = 0; i < numberN; i++) {
            answer = remains * 10 / numberB;
            remains = remains * 10 % numberB;
        }
        System.out.println(answer);
    }
}
