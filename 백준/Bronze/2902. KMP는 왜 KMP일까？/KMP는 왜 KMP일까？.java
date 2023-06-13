import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] names = bufferedReader.readLine().split("-");
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String name : names) {
            bufferedWriter.write(name.charAt(0));
        }
        
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
