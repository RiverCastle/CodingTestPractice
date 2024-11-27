
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int inputLength = input.length();
        Set<String> sub = new HashSet<>();
        for (int length = 1; length <= inputLength; length++) {
            for (int s = 0; s <= inputLength - length; s++) {
                sub.add(input.substring(s, s + length));
            }
        }
        System.out.println(sub.size());
    }
}
