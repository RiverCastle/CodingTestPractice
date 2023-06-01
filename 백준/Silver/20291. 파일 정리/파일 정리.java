import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> hashMap = new HashMap<>(50000);
        int filesNum = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0 ; i < filesNum; i++) {
            String[] fileName = bufferedReader.readLine().split("\\.");
            if (hashMap.containsKey(fileName[1])) {
                hashMap.put(fileName[1], hashMap.get(fileName[1]) + 1);
            } else {
                hashMap.put(fileName[1], 1);
            }
        }
        bufferedReader.close();

        List<String> keyList = new ArrayList<>(hashMap.keySet());
        keyList.sort((key1, key2) -> key1.compareTo(key2));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String key : keyList) {
            bufferedWriter.write(key +" "+ hashMap.get(key) + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
