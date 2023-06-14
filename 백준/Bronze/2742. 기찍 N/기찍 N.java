import java.io.*;

public class Main {//기찍 N

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while (numberN >0) {
            bufferedWriter.write(numberN-- + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        
    }
}
