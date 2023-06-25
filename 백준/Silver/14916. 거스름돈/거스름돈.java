import java.io.*;

public class Main {// 거스름돈

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int changes = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        if (changes < 5) {
            switch (changes) {
                case 1:
                    bufferedWriter.write(-1 + "");
                    break;
                case 2:
                    bufferedWriter.write(1 + "");
                    break;
                case 3:
                    bufferedWriter.write(-1 + "");
                    break;
                case 4:
                    bufferedWriter.write(2 + "");
                    break;
            }
        } else {
            switch (changes % 5) {
                case 1:
                    bufferedWriter.write(changes / 5 - 1 + 3 + "");
                    break;
                case 2:
                    bufferedWriter.write(changes / 5 + 1 + "");
                    break;
                case 3:
                    bufferedWriter.write(changes / 5 - 1 + 4 + "");
                    break;
                case 4:
                    bufferedWriter.write(changes / 5 + 2 + "");
                    break;
                case 0:
                    bufferedWriter.write(changes / 5 + "");
                    break;
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
