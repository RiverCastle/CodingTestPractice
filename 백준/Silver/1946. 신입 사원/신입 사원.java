import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {// 신입 사원 https://www.acmicpc.net/problem/1946

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberT = Integer.parseInt(bufferedReader.readLine());

        for (int t = 0; t < numberT; t++) {
            int length = Integer.parseInt(bufferedReader.readLine());
            int[] interviewRanks = new int[length + 1]; // 인텍스 : 서류점수, 값 : 인터뷰 점수 (서류점수로 정렬)
            for (int i = 0; i < length; i++) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

                int resumeRank = Integer.parseInt(stringTokenizer.nextToken());
                int interviewRank = Integer.parseInt(stringTokenizer.nextToken());
                interviewRanks[resumeRank] = interviewRank;
            }
            int answer = 1;
            int lastSuccess = interviewRanks[1];
            for (int i = 2; i <= length; i++) { // =꼭 붙이기..!
                if (interviewRanks[i] < lastSuccess) {// 뒤의 후보가 인터뷰 점수가 더 높을 때,
                    answer++;
                    lastSuccess = interviewRanks[i];
                }
            }
            bufferedWriter.write(answer + "\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
