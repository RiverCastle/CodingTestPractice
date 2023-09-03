import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 0; i < n; i++) {
            map.put(bufferedReader.readLine(), 1);
        }

        for (int i = 0; i < m; i++) {
            String name = bufferedReader.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
            if (map.get(name) == 2) list.add(name);
        }
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Collections.sort(list);

        bufferedWriter.write(list.size() + "\n");
        for (String name : list) {
            bufferedWriter.write(name + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
