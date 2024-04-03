
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(br.readLine());
        String[] serials = new String[numberN];
        for (int i = 0; i < numberN; i++) {
            serials[i] = br.readLine();
        }

        // 정렬하기
        Arrays.sort(serials, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int sum1 = sumOfNumbers(o1);
                    int sum2 = sumOfNumbers(o2);
                    if (sum1 == sum2) return o1.compareTo(o2);
                    else return sum1 - sum2;
                }
                return o1.length() - o2.length();
            }
        });

        // 출력하기
        StringBuilder sb = new StringBuilder();
        for (String serial : serials) 
            sb.append(serial).append("\n");
        System.out.println(sb);
    }

    private static int sumOfNumbers(String serial) {
        int answer = 0;
        for (int i = 0; i < serial.length(); i++) {
            if ('0' < serial.charAt(i) && serial.charAt(i) <= '9') answer += Integer.parseInt(serial.substring(i,i+1));
        }
        return answer;
    }
}
