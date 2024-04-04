
import java.io.*;
import java.util.*;

public class Main {// https://www.acmicpc.net/problem/8979
    public static void main(String[] args) throws IOException {
        // 데이터 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int numberN = Integer.parseInt(inputs[0]);
        int numberK = Integer.parseInt(inputs[1]);
        CountryMedalStat[] datas = new CountryMedalStat[numberN];
        for (int i = 0; i < numberN; i++) {
            inputs = br.readLine().split(" ");
            int id = Integer.parseInt(inputs[0]);
            int goldCnt = Integer.parseInt(inputs[1]);
            int silverCnt = Integer.parseInt(inputs[2]);
            int bronzeCnt = Integer.parseInt(inputs[3]);
            datas[i] = new CountryMedalStat(id, goldCnt, silverCnt, bronzeCnt);
        }
        br.close();

        // 정렬
        Arrays.sort(datas, new Comparator<CountryMedalStat>() {
            @Override
            public int compare(CountryMedalStat o1, CountryMedalStat o2) {
               if (o1.goldCnt == o2.goldCnt) {
                   if (o1.silverCnt == o2.silverCnt) {
                       if (o1.bronzeCnt == o2.bronzeCnt) return 1;
                       else return o1.bronzeCnt - o2.bronzeCnt;
                   } else return o1.silverCnt - o2.silverCnt;
               } else return o1.goldCnt - o2.goldCnt;
            }
        }.reversed());

        datas[0].rank = 1;
        int nextRank = 2;
        for (int i = 1; i < numberN; i++) {
            CountryMedalStat present = datas[i];
            CountryMedalStat before = datas[i - 1];
            if (before.goldCnt == present.goldCnt &&
                before.silverCnt == present.silverCnt &&
                before.bronzeCnt == present.bronzeCnt) {
                present.rank = before.rank;
                nextRank++;
            }
            else {
                present.rank = nextRank;
                nextRank++;
            }
        }

        //출력하기
        for (int i = 0; i < numberN; i++) {
            CountryMedalStat temp = datas[i];
            if (temp.id == numberK) {
                System.out.println(temp.rank);
                break;
            }
        }
    }

    static class CountryMedalStat {
        int id;
        int goldCnt;
        int silverCnt;
        int bronzeCnt;
        int rank;

        public CountryMedalStat(int id, int goldCnt, int silverCnt, int bronzeCnt) {
            this.id = id;
            this.goldCnt = goldCnt;
            this.silverCnt = silverCnt;
            this.bronzeCnt = bronzeCnt;
        }
    }
}
