import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private boolean isPalindrome(int number, int radix) {
        ArrayList<Integer> convert = new ArrayList<>();
        while (number != 0) {
            convert.add(number % radix);
            number /= radix;
        }
        for (int i = 0; i < convert.size() / 2; i++) {
            if (convert.get(i) != convert.get(convert.size() - 1 - i))
                return false;
        }
        return true;
    }

    private void solution() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (target-- > 0) {
            int number = Integer.parseInt(bufferedReader.readLine());
            boolean judge = false;
            for (int radix = 2; radix <= 64 && !judge; radix++) {
                judge = isPalindrome(number, radix);
            }
            stringBuilder.append(judge ? 1 : 0).append('\n');
        }
        System.out.print(stringBuilder);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
