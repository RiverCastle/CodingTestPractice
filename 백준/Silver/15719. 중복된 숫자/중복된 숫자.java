import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static long sumOfArr(int[] intArr) {
        long sum = 0;
        for (int i : intArr) {
            sum += i;
        }
        return sum;
    }

    public static long sumToNMinus1(int givenNumber) {
        long sum = 0;
        for (int i = 1; i < givenNumber; i++) {
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int givenNumber = Integer.parseInt(bufferedReader.readLine());
        long sumToMinus1 = sumToNMinus1(givenNumber);
        int[] givenArr = new int[givenNumber];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < givenNumber; i++) {
            givenArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(sumOfArr(givenArr) - sumToMinus1);
    }
}