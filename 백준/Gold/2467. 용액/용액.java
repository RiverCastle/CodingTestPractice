import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {// 두 용액 https://www.acmicpc.net/problem/2470

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int liquidsNum = Integer.parseInt(bufferedReader.readLine());
        int[] liquids = new int[liquidsNum];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < liquidsNum; i++) priorityQueue.add(Integer.parseInt(stringTokenizer.nextToken()));
        for (int i = 0; i < liquidsNum; i++) liquids[i] = priorityQueue.poll();
        bufferedReader.close();

        int result = 2000000000;
        List<Integer> frontLiquids = new ArrayList<>();
        List<Integer> backLiquids = new ArrayList<>();

        int frontPointer = 0;
        int backPointer = liquidsNum - 1;

        while (result != 0 || frontPointer != backPointer) {
            if (frontPointer >= backPointer) break;
            int frontLiquid = liquids[frontPointer];
            int backLiquid = liquids[backPointer];
            int tempResult = frontLiquid + backLiquid;
            int absTempResult = Math.abs(tempResult);
            if (result > absTempResult) {
                result = absTempResult;
                frontLiquids = new ArrayList<>();
                backLiquids = new ArrayList<>();
                frontLiquids.add(frontLiquid);
                backLiquids.add(backLiquid);
                if (tempResult > 0) backPointer--;
                else frontPointer++;
            } else if (result < absTempResult) {
                if (tempResult > 0) backPointer--;
                else frontPointer++;
            } else {
                frontLiquids.add(frontLiquid);
                backLiquids.add(backLiquid);
                if (tempResult >= 0) backPointer--;
                else frontPointer++;
            }
        }
        System.out.printf("%d %d", frontLiquids.get(0), backLiquids.get(0));
//        System.out.println("result = " + result);
//        System.out.println("frontLiquids = " + frontLiquids);
//        System.out.println("backLiquids = " + backLiquids);
    }
}
