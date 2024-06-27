import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int integerN = Integer.parseInt(br.readLine());
        int[] weightDatas = new int[integerN];
        int[] heightDatas = new int[integerN];
        for (int i = 0; i < integerN; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            weightDatas[i] = Integer.parseInt(st.nextToken());
            heightDatas[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        int[] rankings = new int[integerN];
        for (int i = 0; i < integerN; i++) {
            rankings[i] = 1;
            int presentWeight = weightDatas[i];
            int presentHeight = heightDatas[i];
            for (int j = 0; j < integerN; j++) {
                int targetWeight = weightDatas[j];
                int targetHeight = heightDatas[j];
                if (presentWeight < targetWeight & presentHeight < targetHeight) rankings[i] += 1;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int ranking : rankings) bw.write(ranking + " ");
        bw.flush();
        bw.close();
    }
}
