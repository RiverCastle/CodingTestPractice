import java.io.*;

public class Main {// 별찍기 - 13

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= numberN; i++) {
            bufferedWriter.write("*".repeat(i) + "\n");
        }
        for (int i = numberN - 1; i > 0; i--) {
            bufferedWriter.write("*".repeat(i) + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
