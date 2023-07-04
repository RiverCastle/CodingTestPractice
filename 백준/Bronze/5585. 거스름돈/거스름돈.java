import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int change = 1000 - Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        int answer = 0;
        answer += change / 500;
        change = change % 500;

        answer += change / 100;
        change = change % 100;

        answer += change / 50;
        change = change % 50;

        answer += change / 10;
        change = change % 10;

        answer += change / 5;
        change = change % 5;

        answer += change;

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(answer + "");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
