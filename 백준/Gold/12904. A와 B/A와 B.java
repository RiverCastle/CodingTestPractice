import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {// A와 B https://www.acmicpc.net/problem/12904

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String lineA = bufferedReader.readLine();
        String lineB = bufferedReader.readLine();
        bufferedReader.close();

        int length = lineB.length() - lineA.length();
        String before = "";
        StringBuffer stringBuffer;
        String after = lineB;

        while (length > 0) {
            String sub = after.substring(0, after.length() - 1);
            stringBuffer = new StringBuffer(sub);
            before = after.endsWith("A") ? sub : stringBuffer.reverse().toString();
            length--;
            after = before;
        }
//        System.out.println("before = " + before);
//        System.out.println("lineA = " + lineA);
        if (lineA.equals(before)) System.out.println(1);
        else System.out.println(0);
    }
}
