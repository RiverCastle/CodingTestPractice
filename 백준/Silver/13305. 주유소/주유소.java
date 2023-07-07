import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {// 주유소
    public static int searchNextSupplement(int presentIdx, int[] oilCostsArr) {// 다음 주유소 찾기
        int nextIdx = presentIdx + 1;
        int presentOilCost = oilCostsArr[presentIdx]; // 현재 도시 주유소 가격
        for (int i = presentIdx + 1; i < oilCostsArr.length; i++) {
            if (presentOilCost < oilCostsArr[nextIdx]) { // 다음 주유소와 비교시 작으면
                nextIdx++; // 그 다음 주유소 탐색
            } else { // 싸거나 같은 주유소 발견
                break;
            }
        }
        return nextIdx;
    }
    public static int getdistanceToNextIdx(int presentIdx, int nextIdx, int[] distancesArr) {// 다음 주유소까지 거리 찾기
        int answer = 0;
        for (int i = presentIdx + 1; i <= nextIdx; i++) {
            answer += distancesArr[i];
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        // 데이터 입력받기
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int cities = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer roadLengths = new StringTokenizer(bufferedReader.readLine());
        StringTokenizer oilCosts = new StringTokenizer(bufferedReader.readLine());

        int[] distancesArr = new int[cities];

        for (int i = 1; i < distancesArr.length; i++) {
            distancesArr[i] = Integer.parseInt(roadLengths.nextToken());
        }

        int[] oilCostsArr = new int[cities - 1];
        for (int i = 0; i < oilCostsArr.length; i++) {
            oilCostsArr[i] = Integer.parseInt(oilCosts.nextToken());
        }

        // 실행
        int answer = 0;
        int presentIdx = 0;
        while (presentIdx < cities - 1) {
            int nextIdx = searchNextSupplement(presentIdx, oilCostsArr);
            answer += oilCostsArr[presentIdx] * getdistanceToNextIdx(presentIdx, nextIdx, distancesArr);
            presentIdx = nextIdx;
        }
        System.out.println(answer);
    }
}
