import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(br.readLine());
        int order = 0;
        int number = 666;
        while (order != numberN) {
            String strValue = String.valueOf(number);
            if (strValue.contains("666")) {
                order += 1;
            }
            number += 1;
        }
        System.out.println(number - 1);
    }
}
