import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {// 토마토 미해결
    private static int days;

    public static int[][][] getRiped(int[][][] box) throws IOException {
        Queue<int[]> riping = new LinkedList<>();
        for (int h = 0; h < box.length; h++) {
            for (int n = 0; n < box[0].length; n++) {
                for (int m = 0; m < box[0][0].length; m++) {
                    if (box[h][n][m] == 1) {
                        int[] location = new int[3];
                        location[0] = h;
                        location[1] = n;
                        location[2] = m;
                        riping.add(location);
                    }
                }
            }
        }

        while (!riping.isEmpty()) {
            int ripedNumber = riping.size();
            for (int i = 0; i < ripedNumber; i++) {
                int[] location = riping.poll(); // box[numberH][numberN][numberM]
                int numberH = location[0];
                int numberN = location[1];
                int numberM = location[2];

                if (numberH - 1 >= 0 && box[numberH - 1][numberN][numberM] == 0) {// 위
                    box[numberH - 1][numberN][numberM] = 1;
                    riping.offer(new int[]{numberH - 1, numberN, numberM});
                }
                if (numberH + 1 < box.length && box[numberH + 1][numberN][numberM] == 0) {// 아래
                    box[numberH + 1][numberN][numberM] = 1;
                    riping.offer(new int[]{numberH + 1, numberN, numberM});
                }
                if (numberN - 1 >= 0 && box[numberH][numberN - 1][numberM] == 0) {// 뒤
                    box[numberH][numberN - 1][numberM] = 1;
                    riping.offer(new int[]{numberH, numberN - 1, numberM});
                }
                if (numberN + 1 < box[0].length && box[numberH][numberN + 1][numberM] == 0) {// 앞
                    box[numberH][numberN + 1][numberM] = 1;
                    riping.offer(new int[]{numberH, numberN + 1, numberM});
                }
                if (numberM - 1 >= 0 && box[numberH][numberN][numberM - 1] == 0) {// 왼쪽
                    box[numberH][numberN][numberM - 1] = 1;
                    riping.offer(new int[]{numberH, numberN, numberM - 1});
                }
                if (numberM + 1 < box[0][0].length && box[numberH][numberN][numberM + 1] == 0) {// 오른쪽
                    box[numberH][numberN][numberM + 1] = 1;
                    riping.offer(new int[]{numberH, numberN, numberM + 1});
                }
            }
            days++;
        }
        days--;
        return box;
    }
    
    public static boolean containsZero(int[][][] box) {
        for (int h = 0; h < box.length; h++) {
            for (int n = 0; n < box[0].length; n++) {
                for (int m = 0; m < box[0][0].length; m++) {
                    if (box[h][n][m] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void printBox(int[][][] box) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int h = 0; h < box.length; h++) {
            for (int n = 0; n < box[0].length; n++) {
                for (int m = 0; m < box[0][0].length; m++) {
                    bufferedWriter.write(box[h][n][m] + " ");
                }
                bufferedWriter.write("\n");
            }
        }
        bufferedWriter.flush();
    }

    public static void main(String[] args) throws IOException {// 토마토
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberM = Integer.parseInt(stringTokenizer.nextToken());
        int numberN = Integer.parseInt(stringTokenizer.nextToken());
        int numberH = Integer.parseInt(stringTokenizer.nextToken());

        int[][][] tomatoBox = new int[numberH][numberN][numberM];

        for (int h = 0; h < numberH; h++) {
            for (int n = 0; n < numberN; n++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                for (int m = 0; m < numberM; m++){
                    tomatoBox[h][n][m] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }
        }
        tomatoBox = getRiped(tomatoBox);
        if (containsZero(tomatoBox)) System.out.println(-1);
        else System.out.println(days);
    }
}
