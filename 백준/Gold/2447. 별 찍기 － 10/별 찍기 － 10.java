
import java.io.*;

public class Main {// 별찍기 10 https://www.acmicpc.net/problem/2447    static StringBuilder sb = new StringBuilder();
    public static BufferedWriter bufferedWriter;
    
    public static void star(int i, int j, int numberN) throws IOException {
        if ((i / numberN) % 3 == 1 && (j / numberN) % 3 == 1) { // 빈칸이라면,
            bufferedWriter.write(" ");
        } else { // 빈칸이 아니라면
            if (numberN == 1) bufferedWriter.write("*"); // 3으로 더이상 나눠지지 않는 1이 되었을 때 * 출력
            else star(i, j, numberN / 3); // 정사각형 사이즈를 3으로 나눠가면서 검사
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numberN; i++) { // 정사각형 탐색
            for (int j = 0; j < numberN; j++) {
                star(i, j, numberN);
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
