import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {// 다각형의 대각선 https://www.acmicpc.net/problem/3049
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        System.out.println(numberN * (numberN - 1) * (numberN - 2) * (numberN - 3) / 24);    
    }
}
