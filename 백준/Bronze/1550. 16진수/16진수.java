import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.valueOf(bufferedReader.readLine(), 16));
        bufferedReader.close();
    }
}
