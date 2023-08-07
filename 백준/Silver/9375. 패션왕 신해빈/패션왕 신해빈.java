import java.io.*;
import java.util.*;

public class Main {// 패션왕 신해빈

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int tests = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < tests; i++) {
            int items = Integer.parseInt(bufferedReader.readLine());
            Map<String, Integer> itemMap = new HashMap<>();
            for (int j = 0; j < items; j++) {
                String[] itemTokens = bufferedReader.readLine().split(" ");
                String category = itemTokens[1];
                itemMap.put(category, itemMap.getOrDefault(category, 0) + 1);
            }
            
            int answer = 1;
            for (int value : itemMap.values()) {
                answer *= (value + 1);
            }
            answer--;  // Subtract 1 for the case of no items from any category
            
            bufferedWriter.write(answer + "\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
