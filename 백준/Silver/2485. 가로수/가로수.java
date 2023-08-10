import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {//가로수
    public static int getGCD(int num1, int num2) {
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int rest = num1 % num2;
        while (rest != 0) {
            num1 = num2;
            num2 = rest;
            rest = num1 % num2;
        }
        return num2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int existingTrees = Integer.parseInt(bufferedReader.readLine());
        int[] existingTreesLocArr = new int[existingTrees];
        for (int i = 0; i < existingTrees; i++) {
            existingTreesLocArr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        List<Integer> distances = new ArrayList<>();
        distances.add(existingTreesLocArr[2] - existingTreesLocArr[1]);
        for (int i = 0; i < existingTrees - 1; i++) {
            int distance = existingTreesLocArr[i + 1] - existingTreesLocArr[i];
            if (!distances.contains(distance)) {
                distances.add(distance);
            }
        }

        int minGCD = distances.get(0);
        for (int i = 0; i < distances.size() - 1; i++) {
            int tempGCD = getGCD(distances.get(i), distances.get(i + 1));
            if (tempGCD < minGCD) {
                minGCD = tempGCD;
            }
        }
        int neededTrees = 0;

        for (int i = existingTreesLocArr[0]; i <= existingTreesLocArr[existingTreesLocArr.length - 1]; i += minGCD) {
            neededTrees += 1;
        }
        neededTrees -= existingTreesLocArr.length;
        System.out.println(neededTrees);
    }
}
