import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public void Solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberN = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberN; i++) {
            int tests = Integer.parseInt(bufferedReader.readLine());
            int[] testsArr = new int[tests];
            for (int j = 0; j < tests; j++) {
                testsArr[j] = Integer.parseInt(bufferedReader.readLine());
            }
            boolean judge = false;
            int divisor = 1;
            while (!judge) {
                List<Integer> remains = new ArrayList<>();
                remains.add(testsArr[0] % divisor);

                for (int j = 1; j < tests; j++) {
                    int remain = testsArr[j] % divisor;
                    if (remains.contains(remain)) break;
                    else remains.add(remain);
                }
                if (remains.size() == tests) {
                    judge = true;
                } else divisor++;
            }
            bufferedWriter.write(divisor + "\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {
        Main q3711 = new Main();
        q3711.Solution();
    }
}
