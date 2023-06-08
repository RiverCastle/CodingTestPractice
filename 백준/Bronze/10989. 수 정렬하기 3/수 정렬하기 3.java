import java.io.*;

public class Main { //수 정렬하기 3 메모리초과 https://www.acmicpc.net/problem/10989
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(bufferedReader.readLine());
        int[] numberCnt = new int[10000];
        for (int i = 0; i < lines; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            numberCnt[number - 1] += 1;
        }
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 10000; i++) {
            if (numberCnt[i] != 0) {
                for (int j = 0 ; j < numberCnt[i]; j++) {
                    bufferedWriter.write(i + 1 +"\n");
                }
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        
    }
}