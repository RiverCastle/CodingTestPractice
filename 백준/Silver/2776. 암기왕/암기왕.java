
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberT = Integer.parseInt(br.readLine());

        for (int t = 0; t < numberT; t++) {
            int number1 = Integer.parseInt(br.readLine());
                Set<Integer> note1 = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < number1; i++) {
                note1.add(Integer.parseInt(st.nextToken()));
            }

            int number2 = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < number2; i++) {
                int answer = note1.contains(Integer.parseInt(st.nextToken())) ? 1 : 0;
                bw.write(answer + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
