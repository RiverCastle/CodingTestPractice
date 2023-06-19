import java.io.*;

public class Main {
    public static boolean isPalindrome(String string) {// 판단
        int length = string.length();
        for (int i = 0; i < length / 2; i++) {
            if (string.charAt(i) != string.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < tests; i++) {
            boolean exist = false;
            int stringArrLength = Integer.parseInt(bufferedReader.readLine());
            String[] strings = new String[stringArrLength];
            for (int j = 0; j < stringArrLength; j++) {// 문자열로 배열만들기
                strings[j] = bufferedReader.readLine();
            }
            for (int j = 0; j < stringArrLength; j++) {
                if (exist) {
                    break;
                }
                for (int k = 0; k < stringArrLength; k++) {
                    String createdString = "";
                    if (j != k) {
                        createdString = strings[j] + strings[k];
                        if (isPalindrome(createdString)) {
                            bufferedWriter.write(createdString + "\n");
                            exist = true;
                        }
                    }
                    if (exist) {
                        break;
                    }
                }
            }
            if (!exist) {
                bufferedWriter.write(0 + "\n");
            }
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
