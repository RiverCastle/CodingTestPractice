import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 무한 문자열 https://www.acmicpc.net/problem/12871

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stringS = bufferedReader.readLine();
        String stringT = bufferedReader.readLine();

        if (stringS.length() > stringT.length()) {
            String temp = stringS;
            stringS = stringT;
            stringT = temp;
        }
        
        int lengthS = stringS.length();
        int lengthT = stringT.length();

        int rest = lengthT % lengthS;
        if (rest == 0)
            System.out.println(stringS.repeat(stringT.length() / stringS.length()).equals(stringT) ? 1 : 0);
        else {
            int tempT = lengthT;
            int tempS = lengthS;

            while (rest != 0) {
                tempT = tempS;
                tempS = rest;
                rest = tempT % tempS;
            }

            int lcm = lengthS * lengthT / tempS;
            System.out.println(stringS.repeat(lcm / lengthS).equals(stringT.repeat(lcm / lengthT)) ? 1 : 0);
        }
    }
}
