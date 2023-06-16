import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {//숫자 게임

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int players = Integer.parseInt(bufferedReader.readLine());
        int[][] deck = new int[players][5];
        StringTokenizer stringTokenizer;
        for (int i = 0; i < players; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < 5; j++) {
                deck[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        int[][] points = new int[players][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = 9;
        }
        int[] winner = new int[4];//인덱스,점수,합,중복여부
        for (int i = 0; i < players; i++) {//플레이어
            for (int j = 0; j < deck[0].length - 2; j++) {
                for (int k = j + 1; k < deck[0].length - 1; k++) {
                    for (int l = k + 1; l < deck[0].length; l++) {
                        if (winner[1] < (deck[i][j] + deck[i][k] + deck[i][l]) % 10) { //크다
                            winner[0] = i;
                            winner[1] = (deck[i][j] + deck[i][k] + deck[i][l]) % 10;
                            winner[3] = 0;
                        } else if (winner[1] == (deck[i][j] + deck[i][k] + deck[i][l]) % 10) {//같다
                            winner[0] = i;
                            winner[3] = 1;
                        }
                    }
                }
            }
        }
        //인덱스,점수,합,중복여부
        System.out.println(winner[0] + 1);
    }
}
