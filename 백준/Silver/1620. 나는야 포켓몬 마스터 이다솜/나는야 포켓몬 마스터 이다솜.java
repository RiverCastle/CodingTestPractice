import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberN = Integer.parseInt(stringTokenizer.nextToken());
        int numberM = Integer.parseInt(stringTokenizer.nextToken());
        String[] keys = new String[numberN];

        int value = 1;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numberN; i++) {
            String key = bufferedReader.readLine();
            map.put(key, value++);
            keys[i] = key;
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < numberM; i++) {
            String line = bufferedReader.readLine();
            if (line.charAt(0) <= 'Z' && line.charAt(0) >= 'A') {
                bufferedWriter.write(map.get(line) + "\n");
            } else bufferedWriter.write(keys[Integer.parseInt(line) - 1] + "\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
