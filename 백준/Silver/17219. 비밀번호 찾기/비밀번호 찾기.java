import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberN = Integer.parseInt(st.nextToken());
        int numberM = Integer.parseInt(st.nextToken());

        Map<String, String> passwords = new HashMap<>();
        for (int i = 0; i < numberN; i++) {
            st = new StringTokenizer(br.readLine());
            passwords.put(st.nextToken(), st.nextToken());
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numberM; i++) {
            bw.write(passwords.get(br.readLine()) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}