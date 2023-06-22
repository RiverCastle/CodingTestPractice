import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        int cnt = 0;
        List<Integer> results = new ArrayList<>();
        results.add(numberN);
        int preListSize = 0;
        int postListSize = results.size();
        while (!results.contains(1)) {
            int resultsSize = results.size();
            for (int i = postListSize -1; i >= preListSize; i--) {
                int target = results.get(i);
                if (target % 3 == 0) {
                    results.add(target / 3);
                }
                if (target % 2 == 0) {
                    results.add(target / 2);
                }
                results.add(target - 1);
            }
            preListSize = postListSize;
            postListSize = results.size();
            cnt++;
        }
        System.out.println(cnt);
    }
}
