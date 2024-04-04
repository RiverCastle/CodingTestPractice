
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.substring(i);
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String suffix : arr) {
            sb.append(suffix).append("\n");
        }
        System.out.println(sb);
    }
}
