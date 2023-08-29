import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {// 케빈 베이컨의 6단계 법칙 https://www.acmicpc.net/problem/1389
    private static int numberN;
    private static int numberM;
    private static List<Integer>[] friends;

    public static int find(int numberA, int numberB) {
        int answerTemp = 1;
        boolean[] visited = new boolean[numberN + 1];
        List<Integer> friend = friends[numberA];
        visited[numberA] = true;
        while (!friend.contains(numberB)) {
            answerTemp++;
            List<Integer> nextFriend = new ArrayList<>();
            for (int person : friend) {
                if (!visited[person]) {
                    for (int nextPerson : friends[person]) {
                        nextFriend.add(nextPerson);
                    }
                }
            }
            friend = nextFriend;
        }
        return answerTemp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        numberN = Integer.parseInt(stringTokenizer.nextToken());
        numberM = Integer.parseInt(stringTokenizer.nextToken());

        friends = new List[numberN + 1];
        for (int i = 1; i <= numberN; i++) {
            friends[i] = new ArrayList<>();
        }

        for (int i = 0; i < numberM; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int numberA = Integer.parseInt(stringTokenizer.nextToken());
            int numberB = Integer.parseInt(stringTokenizer.nextToken());
            friends[numberA].add(numberB);
            friends[numberB].add(numberA);
        }

        int[] answers = new int[numberN + 1];
        for (int i = 1; i <= numberN; i++) {
            int answer = 0;
            for (int j = 1; j <= numberN; j++) {
                if (i != j) {
                    answer += find(i, j);
//                    System.out.printf("%d %d %d\n", i, j, find(i, j));
                }
            }
            answers[i] = answer;
        }
//        System.out.println("Arrays.toString(answers) = " + Arrays.toString(answers));
        int bestPerson = answers[1];
        int idx = 1;
        for (int i = 2; i < numberN; i++) {
            int value = answers[i];
            if (value < bestPerson) {
                bestPerson = value;
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
