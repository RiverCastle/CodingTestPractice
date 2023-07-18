import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {// 퇴사 bf

    public static void printData(int[][] arr2dim) {
        for (int i = 0 ; i < arr2dim.length; i++) {
            System.out.println(Arrays.toString(arr2dim[i]));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(bufferedReader.readLine());

        int[][] timeNProfits = new int[numberN + 1][3]; // 시작 종료 이익
        for (int i = 1; i < numberN + 1; i++) {
            StringTokenizer tpTokens = new StringTokenizer(bufferedReader.readLine());
            int time = Integer.parseInt(tpTokens.nextToken());
            int profit = Integer.parseInt(tpTokens.nextToken());

            timeNProfits[i][0] = i;
            timeNProfits[i][1] = i + time - 1;
            timeNProfits[i][2] = profit;

//            System.out.println(Arrays.toString(timeNProfits[i]));
        }

        /*
        List<Integer>[] dayProfits = new List[numberN + 1];
        for (int i = 0; i < dayProfits.length; i++) {
            dayProfits[i] = new ArrayList<>();
            dayProfits[i].add(0);
        }
         */

        int[] maxProfitsPerDay = new int[numberN + 1];

//        System.out.println(Arrays.toString(dayProfits));
        Queue<Integer> next = new ArrayDeque<>();
        next.offer(0);

//        printData(timeNProfits);
        

        while (!next.isEmpty()) {
            int startDay = next.poll() + 1; // 상담시작일
//            System.out.println("startDay = " + startDay);
            if (startDay > numberN) continue;
            int endDay = timeNProfits[startDay][1];
            int reward = timeNProfits[startDay][2];
            if (endDay > numberN) {// 퇴사전에 상담 완료 불가능 pass
//                System.out.println("퇴사전에 상담 완료 불가능 pass" + startDay);
                maxProfitsPerDay[startDay] = Math.max(maxProfitsPerDay[startDay], maxProfitsPerDay[startDay - 1]);
                /* 최대 금액
                for (int profit : dayProfits[startDay - 1]) {
                    dayProfits[startDay].add(profit);
                }
                */
//                next.offer(startDay + 1);
                next.offer(startDay);
//                System.out.println(timeNProfits[startDay][0] + "일 종료 후 예산F1 = " + dayProfits[timeNProfits[startDay][0]]);
                continue;
            }

//            System.out.println("상담시작" + startDay);
            // do 종료일에 이익 합을 넣는다.
            maxProfitsPerDay[endDay] = Math.max(maxProfitsPerDay[endDay], maxProfitsPerDay[startDay - 1] + reward);
            /* 최대 금액
            for (int profit : dayProfits[startDay - 1]) {
                dayProfits[endDay].add(profit + reward);
            }
             */
//            System.out.println(endDay + "일 종료 후 예산F2 = " + dayProfits[endDay]);
            next.offer(endDay);
            // pass
//            System.out.println(startDay == endDay);
            if (startDay == endDay) continue;
//            System.out.println("상담생략" + startDay);
//            maxProfitsPerDay[startDay] = maxProfitsPerDay[startDay - 1];
            maxProfitsPerDay[startDay] = Math.max(maxProfitsPerDay[startDay], maxProfitsPerDay[startDay - 1]);
            /*
            for (int profit : dayProfits[startDay - 1]) {
                dayProfits[startDay].add(profit);
            }
             */
            next.offer(startDay);
//            System.out.println(timeNProfits[startDay][0] + "일 종료 후 예산F3 = " + dayProfits[timeNProfits[startDay][0]]);

//            System.out.println("next = " + next);
        }
        /*
        int max = 0;
        for (int profit : dayProfits[numberN]) {
            if (profit > max) max = profit;
        }
         */
        System.out.println(maxProfitsPerDay[numberN]);
    }
}
