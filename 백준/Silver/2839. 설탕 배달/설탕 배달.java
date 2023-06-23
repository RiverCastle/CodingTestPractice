import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sugarAmount = Integer.parseInt(bufferedReader.readLine());
        
        int answer = 0;
        if (sugarAmount < 5) {
            switch (sugarAmount % 5) {
                case 3:
                    System.out.println(1);
                    break;
                case 4:
                    System.out.println(-1);
                    break;
            }
        } else {
            switch (sugarAmount % 5) {
                case 0:
                    System.out.println(sugarAmount / 5);
                    break;
                case 1:
                    if (sugarAmount>=6) {
                        System.out.println(sugarAmount / 5 - 1 + 2);
                        break;
                    } else {
                        System.out.println(-1);
                        break;
                    }
                case 2:
                    if (sugarAmount >= 12) {
                        System.out.println(sugarAmount / 5 - 2 + 4);
                        break;
                    } else {
                        System.out.println(-1);
                        break;
                    }
                case 3:
                    System.out.println(sugarAmount / 5 + 1);
                    break;
                case 4:
                    if (sugarAmount >= 9) {
                        System.out.println(sugarAmount / 5 - 1 + 3);
                        break;
                    }
            }
        }
    }
}
