import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {// 반복수열 https://www.acmicpc.net/problem/2331
    public static int getNextResult(int number, int numberP) {
        int answer = 0;
        while (number >= 10) {
            answer += Math.pow(number % 10, numberP);
            number /= 10;
        }
        answer += Math.pow(number % 10, numberP);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberA = Integer.parseInt(stringTokenizer.nextToken());
        int numberP = Integer.parseInt(stringTokenizer.nextToken());

        List<Integer> resultList = new ArrayList<>();
        int cnt = 0;
        resultList.add(numberA);
        int nextResult = getNextResult(numberA, numberP);
        while (!resultList.contains(nextResult)) {
            cnt++;
            resultList.add(nextResult);
            nextResult = getNextResult(nextResult, numberP);
        }
//        System.out.println("nextResult = " + nextResult);
//        System.out.println(resultList);
        System.out.println(resultList.indexOf(nextResult));
    }
}
