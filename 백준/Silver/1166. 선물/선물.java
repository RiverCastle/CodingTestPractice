

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 선물 https://www.acmicpc.net/problem/1166

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int numberN = Integer.parseInt(st.nextToken());
        int numberL = Integer.parseInt(st.nextToken());
        int numberW = Integer.parseInt(st.nextToken());
        int numberH = Integer.parseInt(st.nextToken());

        double low = 0;
        double high = Math.min(numberL, Math.min(numberW, numberH));
        double mid;
        while (low < high) {
            mid = (low + high) / 2;
            long boxes = (long) (numberL / mid) * (long) (numberW / mid) * (long) (numberH / mid);
            if (boxes < numberN) {
                if (high == mid) break;
                high = mid;
            } else {
                if (low == mid) break;
                low = mid;
            }
        }
        System.out.println(low);
    }
}
