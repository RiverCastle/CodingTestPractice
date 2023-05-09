import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        //배열 크기 입력받기
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        //배열 생성하기
        int low = Integer.parseInt(stringTokenizer.nextToken());
        int col = Integer.parseInt(stringTokenizer.nextToken());
        int[][] arr = new int[low][col];

        for (int i = 0; i < low; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // low 입력받기
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        //TestCase number 입력받기
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int testCaseNumber = Integer.parseInt(stringTokenizer.nextToken());
        //TestCases
        for (int i = 0; i < testCaseNumber; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int xLocation1 = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int yLocation1 = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int xLocation2 = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int yLocation2 = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            int sum = 0;

            //범위지정 및 합 및 출력
            for (int j = xLocation1; j <= xLocation2; j++) {
                for (int k = yLocation1; k <= yLocation2; k++) {
                    sum += arr[j][k];
                }
            }
            bufferedWriter.write(sum + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}