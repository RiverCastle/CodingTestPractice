
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int numberN = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int[] arr = new int[numberN];
        int answer = Integer.parseInt(stringTokenizer.nextToken());
        int candidate = answer;

        for (int i = 1; i < numberN; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
            int subSum = Math.max(arr[i], candidate + arr[i]);
            candidate = Math.max(subSum, candidate);
            if (answer >= candidate) {
                candidate = Math.max(arr[i], subSum );
            } else {
                answer = candidate;
            }
        }
        System.out.println(answer);
    }
}
