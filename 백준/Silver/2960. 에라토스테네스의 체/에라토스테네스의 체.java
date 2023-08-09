import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberN = Integer.parseInt(stringTokenizer.nextToken());
        int numberK = Integer.parseInt(stringTokenizer.nextToken());

        int[] intArr = new int[numberN - 1];
        int idx = 0;
        for (int i = 2; i <= numberN; i++) {
            intArr[idx] = i;
            idx++;
        }

        int turn = 0;
        int answer = 0;
        for (idx = 0; idx < intArr.length; idx++) {
            if (turn == numberK) break;
            if (intArr[idx] != 0) {
                int numberP = intArr[idx];
                intArr[idx] = 0;
                answer = numberP;
                int tempIdx = idx + numberP;
                turn++;
//                System.out.println("turn = " + turn);
//                System.out.println("answer = " + answer);
//                System.out.println("Arrays.toString(intArr) = " + Arrays.toString(intArr));
                while (tempIdx < intArr.length) {
                    if (intArr[tempIdx] != 0) {
                        answer = intArr[tempIdx];
                        intArr[tempIdx] = 0;
                        tempIdx += numberP;
                        turn++;
//                        System.out.println("turn = " + turn);
//                        System.out.println("answer = " + answer);
//                        System.out.println("Arrays.toString(intArr) = " + Arrays.toString(intArr));
                        if (turn == numberK) break;
                    } else tempIdx += numberP;
                }
            }
        }
        System.out.println(answer);
    }
}
