import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int orders = Integer.parseInt(bufferedReader.readLine());
        List<Integer> integerList = new ArrayList<>();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < orders; i++) {
            String[] order = bufferedReader.readLine().split(" ");
            if (order[0].equals("add")) {
                if (integerList.indexOf(Integer.parseInt(order[1])) == -1) {
                    integerList.add(Integer.parseInt(order[1]));
                }
            } else if (order[0].equals("remove")) {
                if (integerList.indexOf(Integer.parseInt(order[1])) != -1) {
                    integerList.remove(integerList.indexOf(Integer.parseInt(order[1])));
                }
            } else if (order[0].equals("check")) {
                if (integerList.indexOf(Integer.parseInt(order[1])) == -1) {
                    bufferedWriter.write(0 + "\n");
                } else {
                    bufferedWriter.write(1 + "\n");
                }
            } else if (order[0].equals("toggle")) {
                if (integerList.indexOf(Integer.parseInt(order[1])) == -1) {
                    integerList.add(Integer.parseInt(order[1]));
                } else {
                    integerList.remove(integerList.indexOf(Integer.parseInt(order[1])));
                }
            } else if (order[0].equals("all")) {
                integerList = new ArrayList<>(20);
                for (int j = 1; j <= 20; j++) {
                    integerList.add(j);
                }
            } else if (order[0].equals("empty")) {
                integerList.clear();
            }
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
