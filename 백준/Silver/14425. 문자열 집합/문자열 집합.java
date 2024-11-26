
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberN = Integer.parseInt(st.nextToken());
        int numberM = Integer.parseInt(st.nextToken());
        Map<String, Integer> wordsMap = new HashMap<>();
        for (int i = 0; i < numberN; i++) {
            wordsMap.put(br.readLine(), 1);
        }

        int answer = 0;
        for (int i = 0; i < numberM; i++) {
            if (wordsMap.containsKey(br.readLine())) answer++;
        }

        System.out.println(answer);
    }
}
