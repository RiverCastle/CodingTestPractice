
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(br.readLine());
        Grade[] grades = new Grade[numberN];
        for (int i = 0; i < numberN; i++) {
            String[] data = br.readLine().split(" ");
            grades[i] = new Grade(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]));
        }
        Arrays.sort(grades, new Comparator<Grade>() {
            @Override
            public int compare(Grade o1, Grade o2) {
                if (o1.korean != o2.korean) {
                    // 국어 점수가 감소하는 순서로 정렬
                    return Integer.compare(o2.korean, o1.korean);
                } else if (o1.english != o2.english) {
                    // 국어 점수가 같으면 영어 점수가 증가하는 순서로 정렬
                    return Integer.compare(o1.english, o2.english);
                } else if (o1.math != o2.math) {
                    // 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로 정렬
                    return Integer.compare(o2.math, o1.math);
                } else {
                    // 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 정렬
                    return o1.name.compareTo(o2.name);
                }
            }
        });


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberN; i++) {
            sb.append(grades[i].name).append("\n");
        }
        System.out.println(sb);
    }

    static class Grade {
        String name;
        int korean;
        int english;
        int math;

        public Grade(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }
}
