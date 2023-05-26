import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cardsNum = scanner.nextInt();
        if (cardsNum == 1) {
            System.out.println(1);
        } else {
            int length = 2 * cardsNum - 2;
            int[] cards = new int[length];

            for (int i = length - 1; i >= length - cardsNum; i--) {
                cards[i] = length - i;
            }

            while (--length > 1 ) { //last pointer idx
                length--;
                cardsNum--;
                cards[length - cardsNum] = cards[length];
                //System.out.println(Arrays.toString(cards));
            }
            System.out.println(cards[0]);
        }
    }
}
