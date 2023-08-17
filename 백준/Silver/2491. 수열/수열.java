import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static List<Integer> arrAscending;
    private static List<Integer> arrDescending;
    private static int maxLength;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer arrTokens = new StringTokenizer(bufferedReader.readLine());
        int[] arr = new int[numberN];
        for (int i = 0; i < numberN; i++) {
            arr[i] = Integer.parseInt(arrTokens.nextToken());
        }

        arrAscending = new ArrayList<>();
        arrDescending = new ArrayList<>();
        arrAscending.add(arr[0]);
        arrDescending.add(arr[0]);
        maxLength = 1;
        int lastValue = arr[0];
        for (int i = 1; i < numberN; i++) {
            int value = arr[i];
            if (lastValue == value) {
                arrAscending.add(value);
                arrDescending.add(value);
            } else if (lastValue < value) {
                arrAscending.add(value);
                arrDescending = new ArrayList<>();
                arrDescending.add(value);
            } else if (lastValue > value) {
                arrDescending.add(value);
                arrAscending = new ArrayList<>();
                arrAscending.add(value);
            }
            lastValue = value;
            if (maxLength < arrAscending.size()) maxLength = arrAscending.size();
            if (maxLength < arrDescending.size()) maxLength = arrDescending.size();

        }

        System.out.println(maxLength);

    }
}
