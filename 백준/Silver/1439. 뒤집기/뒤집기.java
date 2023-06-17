import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        bufferedReader.close();

        List<Character> charList = new ArrayList<>();
        charList.add(line.charAt(0));
        char peek = charList.get(charList.size() - 1);

        for (int i = 1; i < line.length(); i++) {
            char target = line.charAt(i);
            if (peek != target) {
                charList.add(target);
                peek = target;
            }
        }
        int cntOfOne = 0;
        int cntOfZero = 0;
        for (int i = 0; i < charList.size(); i++) {
            if (charList.get(i) == '1') {
                cntOfOne += 1;
            } else {
                cntOfZero += 1;
            }
        }
        System.out.println(cntOfOne > cntOfZero ? cntOfZero : cntOfOne);
    }
}
