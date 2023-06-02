import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = bufferedReader.readLine();
        
        while (!num.equals("0")) {
            boolean judge = true;
            for (int i = 0; i < num.length() / 2; i ++) {
                if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                    judge = false;
                    bufferedWriter.write("no\n");

                    break;
                }
            }
            if (judge) {
                bufferedWriter.write("yes\n");
            }
            num = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}