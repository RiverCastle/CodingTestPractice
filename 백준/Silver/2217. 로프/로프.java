import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[numberN];
        for (int i = 0; i < numberN; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        arr = Arrays.stream(arr).sorted().toArray();

        int answer = 0;
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <numberN; i++) {
            int possibleWeight = arr[i] * (numberN - i);
//            System.out.println("possibleWeight = " + possibleWeight);
            if (answer < possibleWeight) answer = possibleWeight;
        }
        System.out.println(answer);

    }
}
