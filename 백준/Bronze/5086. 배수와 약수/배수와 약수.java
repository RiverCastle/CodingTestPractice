import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        StringTokenizer stringTokenizer;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while (!line.equals("0 0")) {
            stringTokenizer = new StringTokenizer(line);
            int num1 = Integer.parseInt(stringTokenizer.nextToken());
            int num2 = Integer.parseInt(stringTokenizer.nextToken());

            if (num2 % num1 ==0) {
                bufferedWriter.write("factor\n");
            } else if (num1 % num2 == 0) {
                bufferedWriter.write("multiple\n");
            } else {
                bufferedWriter.write("neither\n");
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
