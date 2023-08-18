import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {// 수 이어가기 예제성공 https://www.acmicpc.net/problem/2635
    private static List<Integer> answerList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());
        for (int i = numberN; i >= 0; i--) {
            List<Integer> integerList = new ArrayList<>();
            integerList.add(numberN);

            int next = i;
            int idx = 1;
            while (next >= 0) {
                integerList.add(next);
                idx++;
                next = integerList.get(idx - 2) - integerList.get(idx - 1);
            }
//            System.out.println("i = " + i);
//            System.out.println(integerList);
            if (answerList.size() < integerList.size()) answerList = integerList;
        }
        System.out.println(answerList.size());
        for (int value : answerList) {
            System.out.printf("%d ", value);
        }
    }
}
