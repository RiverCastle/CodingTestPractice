
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberN = Integer.parseInt(st.nextToken());
        int numberT = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[numberN];
        int[] accSum = new int[numberN];
        arr[0] = Integer.parseInt(st.nextToken());
        accSum[0] = arr[0];

        for (int i = 1; i < numberN; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            accSum[i] = arr[i] + accSum[i - 1];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int t = 0; t < numberT; t++) {
            st = new StringTokenizer(br.readLine());
            int startIdx = Integer.parseInt(st.nextToken()) - 1;
            int endInx = Integer.parseInt(st.nextToken()) - 1;

            int answer;

            if (startIdx == 0) {
                answer = accSum[endInx];
            } else {
                answer = accSum[endInx] - accSum[startIdx - 1];
            }
            bw.write(answer + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
