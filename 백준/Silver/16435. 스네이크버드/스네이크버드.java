import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        final int numberOfFruit = Integer.parseInt(stringTokenizer.nextToken());
        int snakeLength = Integer.parseInt(stringTokenizer.nextToken());
        int fruit[] = new int[numberOfFruit];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        for (int i = 0; i < numberOfFruit; i++) {
            fruit[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        
        Arrays.sort(fruit);
        
        for (int i = 0; i < numberOfFruit; i++) {
            if (fruit[i] <= snakeLength) {
                snakeLength++;
            } else {
                break;
            }
        }

        stringBuilder.append(snakeLength);
        stringBuilder.append("\n");

        bufferedWriter.write(stringBuilder.toString());

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
