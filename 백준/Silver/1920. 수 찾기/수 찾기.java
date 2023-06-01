import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrLength = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int targetsLength = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < targetsLength; i++) {
            int target = Integer.parseInt(stringTokenizer.nextToken());
            boolean judge = false;
            for (int j = 0; j < arrLength; j++) {
                if (arr[j] == target){
                    bufferedWriter.write(1 + "\n");
                    judge = true;
                    break;
                }
            }
            if (!judge) {
                bufferedWriter.write(0 + "\n");
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}