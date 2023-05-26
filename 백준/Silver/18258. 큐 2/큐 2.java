import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> queue = new ArrayList<>();
        int pointer = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testTime = Integer.parseInt(bufferedReader.readLine());

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < testTime; i++) {
            String[] line = bufferedReader.readLine().split(" ");
            switch (line[0]) {
                case "push":
                    queue.add(Integer.parseInt(line[1]));
                    break;

                case "pop":
                    bufferedWriter.write(queue.size() - pointer == 0 ? (-1 + "\n") : queue.get(pointer++) + "\n");
                    break;

                case "empty":
                    bufferedWriter.write((queue.size() - pointer == 0 ? 1 : 0) + "\n");
                    break;

                case "size":
                    bufferedWriter.write((queue.size() - pointer) + "\n");
                    break;

                case "front":
                    bufferedWriter.write((queue.size() - pointer == 0 ? -1 : queue.get(pointer)) + "\n");
                    break;

                case "back":
                    bufferedWriter.write((queue.size() - pointer == 0 ? -1 : queue.get(queue.size() - 1)) + "\n");
                    break;
            }
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
