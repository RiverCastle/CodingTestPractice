import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(bufferedReader.readLine()) + 1;
        bufferedReader.close();

        int[][] results = new int[cnt][2];
        results[0] = new int[]{1, 0};
        
        for (int i = 1; i < cnt; i++) {
            results[i][0] = results[i - 1][1];
            results[i][1] = results[i - 1][0] + results[i - 1][1];
        }
        
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(results[cnt - 1][0] + " " + results[cnt - 1][1]);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
