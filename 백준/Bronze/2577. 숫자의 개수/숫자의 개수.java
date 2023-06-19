import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int num3 = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();

        int multiplied = num1 * num2 * num3;

        int[] cnts = new int[10];
        while (multiplied >= 10) {
            cnts[multiplied % 10] += 1;
            multiplied /= 10;
        }
        cnts[multiplied] += 1;
        
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int cnt : cnts) {
            bufferedWriter.write(cnt + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
