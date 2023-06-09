import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {//하얀 칸
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        for (int i = 0; i < 8; i++) {
            String line = bufferedReader.readLine();
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j += 2) {
                    if (line.charAt(j) == 'F'){
                        answer += 1;
                    }
                }
            } else {
                for (int j = 1; j < 8; j += 2) {
                    if (line.charAt(j) == 'F') {
                        answer += 1;
                    }
                }
            }
        }
        bufferedReader.close();
        System.out.println(answer);
    }
}