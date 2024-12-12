
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberN = Integer.parseInt(st.nextToken());
        int numberK = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[numberN];
        for (int i = 0; i < numberN; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (!checkPossibility1(i, value, numberK)) {
                bw.write("No");
                bw.flush();
                return;
            }
        }
        bw.write("Yes");
        bw.flush();
    }

    private static boolean checkPossibility1(int index, int value, int numberK) {
        return Math.abs(index - value) % numberK == 0;
    }
}
