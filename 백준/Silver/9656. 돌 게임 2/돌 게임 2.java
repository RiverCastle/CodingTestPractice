import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 돌 게임2
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int stones = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        switch (stones % 6) {
            case 0:
                System.out.println("SK");
                break;
            case 1:
                System.out.println("CY");
                break;
            case 2:
                System.out.println("SK");
                break;
            case 3:
                System.out.println("CY");
                break;
            case 4:
                System.out.println("SK");
                break;
            case 5:
                System.out.println("CY");
                break;
        }
    }
}
