import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {// 전공책

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        int books = Integer.parseInt(bufferedReader.readLine());

        int[] prices = new int[books];
        String[] titles = new String[books];
        boolean success = false;

        for (int i = 0; i < books; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            prices[i] = Integer.parseInt(stringTokenizer.nextToken());
            titles[i] = stringTokenizer.nextToken();
        }
//        System.out.println(Arrays.toString(prices));
//        System.out.println(Arrays.toString(titles));

        int cases = (1 << books) - 1;
        int minTotal = 0;

        for (int i = 1; i <= cases; i++) {
            int[] alphabets = new int[26];
            int totalPrice = 0;


            for (int j = 0; j < books; j++) {
                if ((i & (1 << j)) > 0) {
                    String title = titles[j];
                    for (int k = 0; k < title.length(); k++) {
                        alphabets[title.charAt(k) - 'A']++;
                    }
                    totalPrice += prices[j];
                }
            }
            // 가능여부 판단
            boolean possible = false;
            for (int j = 0; j < word.length(); j++) {
                int targetAlphabet = word.charAt(j) - 'A';
                if (alphabets[targetAlphabet] == 0) {
                    break;
                }
                alphabets[targetAlphabet]--;
                if (j == word.length() - 1) possible = true;
            }
            if (possible) {
                success = true;
                if (minTotal == 0) minTotal = totalPrice;
                else minTotal = minTotal < totalPrice ? minTotal : totalPrice;
            }
        }
        if (success) System.out.println(minTotal);
        else System.out.println(-1);
    }
}