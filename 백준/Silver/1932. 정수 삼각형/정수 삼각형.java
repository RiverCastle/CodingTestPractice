import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int[][] triangle;
    public static int getValueOfRoom(int floorsIdx, int floorIdx) {
        if (floorIdx > floorsIdx) return triangle[floorsIdx][floorIdx] + triangle[floorsIdx -1][floorIdx - 1];
        else if (floorIdx == 0) return triangle[floorsIdx][floorIdx] + triangle[floorsIdx - 1][floorIdx];
        else {
            int tempValue1 = triangle[floorsIdx][floorIdx] + triangle[floorsIdx - 1][floorIdx - 1];
            int tempValue2 = triangle[floorsIdx][floorIdx] + triangle[floorsIdx - 1][floorIdx];
            if (tempValue1 > tempValue2) return tempValue1;
            else return tempValue2;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int floors = Integer.parseInt(bufferedReader.readLine());
        triangle = new int[floors][floors];

        StringTokenizer floorTokenizer;
        for (int i = 0; i < floors; i++) {
            floorTokenizer = new StringTokenizer(bufferedReader.readLine());
            int[] floor = new int[floors];
            for (int j = 0; j < i + 1; j++) {
                floor[j] = Integer.parseInt(floorTokenizer.nextToken());
            }
            for (int j = i + 1; j < floor.length; j++) {
                floor[j] = -1;
            }
            triangle[i] = floor;
        }
        for (int i = 1; i < floors; i++) {
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = getValueOfRoom(i, j);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int temp : triangle[floors - 1]) {
            if (max < temp) max = temp;
        }
        System.out.println(max);


    }
}
