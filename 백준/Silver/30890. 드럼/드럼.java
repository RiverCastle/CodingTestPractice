import java.io.*;

public class Main {
    private int x;
    private int y;

    public static void main(String[] args) throws IOException {
        Main q30890 = new Main();
        q30890.solution();
    }
    private void solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = bufferedReader.readLine().split(" ");
        bufferedReader.close();

        x = Integer.parseInt(inputs[0]);
        y = Integer.parseInt(inputs[1]);

        //최대 공약수
        int gcd = getGCD(x,y);
        // 최소 공배수
        int whole = x / gcd * y / gcd * gcd;

        int[][] rhythm = new int[2][whole];
        int distanceL = whole / x;
        int distanceR = whole / y;
        for (int i = 0 ; i < whole; i++) {
            if ((i + 1) % distanceL == 0) {
                rhythm[0][i] = 1;
            }
        }
        for (int i = 0; i < whole; i++) {
            if ((i + 1) % distanceR == 0) {

                rhythm[1][i] = 2;
            }
        }

        String answer = "";
        for (int i = 0; i < whole; i++) {
            int rhythmL = rhythm[0][i];
            int rhythmR = rhythm[1][i];
            if (rhythmL == 1 && rhythmR == 2) answer = answer + "3";
            else if (rhythmL == 1) answer = answer + "1";
            else if (rhythmR == 2) answer = answer + "2";
        }
        System.out.println(answer);

    }

    private int getGCD(int num1, int num2) {
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int rest = num1 % num2;
        while (rest != 0) {
            num1 = num2;
            num2 = rest;
            rest = num1 % num2;
        }
        return num2;
    }
}
