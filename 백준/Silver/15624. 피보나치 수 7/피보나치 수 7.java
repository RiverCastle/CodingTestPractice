import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 피보나치 수 7 https://www.acmicpc.net/problem/15624
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        int[] intArr = new int[3];

        intArr[0] = 0;
        intArr[1] = 1;

        if (numberN <= 1) {
            System.out.println(intArr[numberN]);
        } else {
            intArr[2] = intArr[0] + intArr[1];
            int cnt = 2;
            while (numberN != cnt) {
                intArr[0] = intArr[1];
                intArr[1] = intArr[2];
                int newValue = intArr[0] + intArr[1];
                intArr[2] = newValue > 1000000007 ? newValue % 1000000007 : newValue;
                cnt++;
            }
            System.out.println(intArr[2]);
        }
    }
}
