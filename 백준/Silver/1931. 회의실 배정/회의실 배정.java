import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public int solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int meetingCount = Integer.parseInt(bufferedReader.readLine());
        int[][] meetings = new int[meetingCount][2];
        // 회의 정보
        for (int i = 0; i < meetingCount; i++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
            meetings[i][0] = Integer.parseInt(tokenizer.nextToken());
            meetings[i][1] = Integer.parseInt(tokenizer.nextToken());
        }
        // 정렬 기준 : 종료시간으로만 정렬
        // Arrays.sort(meetings, Comparator.comparingInt(o -> o[1])); -> 시작시각과 종료시각이 같으면 처리 불가능

        // 정렬 기준 :
        Arrays.sort(meetings, (o1, o2) -> {
                    // o1, o2는 {시작, 종료}
                    // 시작, 종료가 다른 일반적인 경우) 종료로 정렬
                    if (o1[1] != o2[1]) return o1[1] - o2[1];
                    // 위의 조건문이 실행되지 않은 경우 [0] 시작시간으로 정렬
                    return o1[0] - o2[0];
                }
        );


        // 답안을 저장하기 위한 용도
        int answer = 0;
        // 마지막 종료시간을 저장하기 위한 용도
        int lastEnd = 0;
        for (int i = 0; i < meetingCount; i++) {
            // 선택된 미팅이 가능한지 판단하기 위해
            // i번째 미팅의 시작시간과 현재 종료시간을 비교한다.
            // i번째 미팅의 시작시간 meetings[i][0] >= lastEnd 이어야 한다.
            if (meetings[i][0] >= lastEnd) {
                answer++;
                lastEnd = meetings[i][1];
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Main().solution());
    }
}
