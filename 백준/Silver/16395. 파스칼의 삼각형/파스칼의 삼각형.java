import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 파스칼의 삼각형

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberN = Integer.parseInt(stringTokenizer.nextToken());
        int numberK = Integer.parseInt(stringTokenizer.nextToken());

        int[] triangle = new int[numberN * (numberN + 1) / 2];

        int idx = 0;
        for (int i = 0; i < numberN; i++) {
            triangle[idx + i] = 1;
            idx += i;
        }
        idx = 0;
        for (int i = 2; i <= numberN; i++) {
            triangle[idx + i] = 1;
            idx += i;
        }
        //System.out.println(Arrays.toString(triangle));
        if (numberN >= 3) {
            idx = 4;
            for (int floor = 2; floor < numberN; floor++) {
                int tempIdx = idx;
                for (int i = 0; i < floor - 1; i++) {
                    triangle[tempIdx] = triangle[tempIdx - floor] + triangle[tempIdx - floor - 1];
                    tempIdx++;
                }
                idx += floor + 1;
            }
        }
        System.out.println(triangle[triangle.length - 1 - numberN + numberK]);
    }
}
