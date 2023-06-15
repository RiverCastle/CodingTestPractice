import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main { //세로읽기
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<>();
        int maxlength = 1;
        for (int i = 0; i < 5; i++) {
            String string = bufferedReader.readLine();
            int length = string.length();
            if (length > maxlength) {
                maxlength = length;
            }
            strings.add(string);
        }
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < maxlength; i++) {//타겟문자인덱스
            for (int j = 0; j < strings.size(); j++) {//타겟문자열인덱스
                if (strings.get(j).length() <= i) {
                    continue;
                } else {
                    bufferedWriter.write(strings.get(j).charAt(i));
                }
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
