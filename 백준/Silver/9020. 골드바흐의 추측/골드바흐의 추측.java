import java.io.*;

public class Main {// 골드바흐의 추측 https://www.acmicpc.net/problem/9020

    public static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numberN; i++) {
            int testN = Integer.parseInt(bufferedReader.readLine());
            int start = testN / 2;
            for (int j = start; j >= 1; j--) {
//                System.out.println("j = " + j);
                int bigPrime = testN - j;
//                System.out.println("bigPrime = " + bigPrime);
                if (isPrime(j) && isPrime(bigPrime)) {
//                    System.out.printf("%d %d\n", j, bigPrime);
                    bufferedWriter.write(j + " " + bigPrime + "\n");
                    break;
                }
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
