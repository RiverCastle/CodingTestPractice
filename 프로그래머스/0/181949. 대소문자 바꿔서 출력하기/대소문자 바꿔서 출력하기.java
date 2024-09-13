import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if ('a' <= a.charAt(i) & a.charAt(i) <= 'z') {
                sb.append(Character.toUpperCase(a.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(a.charAt(i)));
            }
        }
        System.out.println(sb.toString());
    }
}