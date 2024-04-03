import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(br.readLine());
        int[] numbers = new int[numberN];
        for (int i = 0; i < numberN; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        // 정렬
        Arrays.sort(numbers);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberN; i++) {
            sb.append(numbers[i]).append("\n");
        }
        System.out.println(sb);
    }
}
