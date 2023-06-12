import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {//행렬 덧셈

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int row = Integer.parseInt(stringTokenizer.nextToken());
        int col = Integer.parseInt(stringTokenizer.nextToken());
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];

        for (int i = 0; i < arr1.length; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }

        }
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                bufferedWriter.write(arr1[i][j] + arr2[i][j] + " ");
            }
            bufferedWriter.write("\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
