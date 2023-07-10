import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        bufferedReader.close();

        int numberA = Integer.parseInt(stringTokenizer.nextToken());
        int numberB = Integer.parseInt(stringTokenizer.nextToken());

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(numberA / numberB + ".");
        int remain = numberA % numberB;

        for (int i = 0; i < 1000; i++) {
            if (remain == 0) break;
            bufferedWriter.write(remain * 10 / numberB +"");
            remain = remain * 10 % numberB;
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
