import java.io.*;
import java.util.Arrays;

public class Main {
    /*
    public static void main(String[] args) {
        for (int i = 0; i <= 40; i++) {
            System.out.println(i);
        }
    }
     */


    public static void main(String[] args) throws IOException {
        int[][] answerArr = {{1, 0}, {0, 1}, {1, 1}, {1, 2}, {2, 3}, {3, 5}, {5, 8}, {8, 13}, {13, 21}, {21, 34}, {34, 55}, {55, 89}, {89, 144}, {144, 233}, {233, 377}, {377, 610}, {610, 987}, {987, 1597}, {1597, 2584}, {2584, 4181}, {4181, 6765}, {6765, 10946}, {10946, 17711}, {17711, 28657}, {28657, 46368}, {46368, 75025}, {75025, 121393}, {121393, 196418}, {196418, 317811}, {317811, 514229}, {514229, 832040}, {832040, 1346269}, {1346269, 2178309}, {2178309, 3524578}, {3524578, 5702887}, {5702887, 9227465}, {9227465, 14930352}, {14930352, 24157817}, {24157817, 39088169}, {39088169, 63245986}, {63245986, 102334155}};

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < tests; i++) {
            int target = Integer.parseInt(bufferedReader.readLine());
            bufferedWriter.write(answerArr[target][0] +" " + answerArr[target][1] + "\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();


/*
        // 가장 큰 target 구하기 OK
        int max = Arrays.stream(targets).max().getAsInt();
        int[][] called = new int[max + 1][2];

        // [1, 0]
        called[0][0] = 1;
        called[0][1] = 0;
        // [0, 1]
        called[1][0] = 0;
        called[1][1] = 1;

        for (int i = 2; i <= max; i++) {
            called[i][0] = called[i - 2][0] + called[i - 1][0];
            called[i][1] = called[i - 2][1] + called[i - 1][1];
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write("{");
        for (int target : targets) {
            bufferedWriter.write("{"+ called[target][0] + ", " + called[target][1] + "}, ");
        }
        bufferedWriter.write("}");
        bufferedWriter.flush();
        bufferedWriter.close();
        */
    }

}
