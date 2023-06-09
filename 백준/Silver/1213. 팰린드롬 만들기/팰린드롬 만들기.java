import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int[] alphabetCnt = new int[90 - 65 + 1];
        
        for (int i = 0; i < word.length(); i++) {
            alphabetCnt[(int) word.charAt(i) - 65] += 1;
        }
        
        int oddCnt = 0;
        for (int cnt : alphabetCnt) {
            if (cnt % 2 == 1) {
                oddCnt += 1;
            }
            if (oddCnt > 1) {//펠린드롬 불가능
                System.out.println("I'm Sorry Hansoo");
                return;
            }
        }
        
        //펠린드롬 가능
        String front = "";
        String center = "";
        String back = "";

        for (int i = 0; i < alphabetCnt.length; i++) {
            while (alphabetCnt[i] > 1) {
                    front += (char) (i + 65);
                    back = ((char) (i + 65)) + back;
                    alphabetCnt[i] -= 2;
            }
            if (alphabetCnt[i] == 1) {
                center += ((char) (i + 65));
            }
        }
        System.out.println(front + center + back);
    }
}