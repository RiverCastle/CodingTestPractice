import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= numberN; i++) {
            String line = br.readLine();
            bw.write(i + "." + " " + line + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
