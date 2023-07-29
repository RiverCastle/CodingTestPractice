import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {// 뒤집힌 덧셈

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberX = Integer.parseInt(stringTokenizer.nextToken());
        int numberY = Integer.parseInt(stringTokenizer.nextToken());

        int revX = 0;
        while (numberX != 0) {
            revX *= 10;
            revX += numberX % 10;
            numberX /= 10;
        }

        int revY = 0;
        while (numberY != 0) {
            revY *= 10;
            revY += numberY % 10;
            numberY /= 10;
        }

        int answer = revX + revY;
        int revAnswer = 0;
        while (answer != 0) {
            revAnswer *= 10;
            revAnswer += answer % 10;
            answer /= 10;
        }
        System.out.println(revAnswer);
    }
}
