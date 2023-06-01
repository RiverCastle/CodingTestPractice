import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {//너의 평점은
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String gradeData = bufferedReader.readLine();
        double sum = 0.0;
        int cnt = 0;
        try {
            while (gradeData != null && !gradeData.equals("")) {
                String[] dataArr = gradeData.split(" ");
                if (dataArr.length >= 3) {
                    double credit = Double.parseDouble(dataArr[1]);

                    if (dataArr[2].equals("A+")) {
                        sum += 4.5 * credit;
                        cnt += credit;
                    } else if (dataArr[2].equals("A0")) {
                        sum += 4.0 * credit;
                        cnt += credit;
                    } else if (dataArr[2].equals("B+")) {
                        sum += 3.5 * credit;
                        cnt += credit;
                    } else if (dataArr[2].equals("B0")) {
                        sum += 3.0 * credit;
                        cnt += credit;
                    } else if (dataArr[2].equals("C+")) {
                        sum += 2.5 * credit;
                        cnt += credit;
                    } else if (dataArr[2].equals("C0")) {
                        sum += 2.0 * credit;
                        cnt += credit;
                    } else if (dataArr[2].equals("D+")) {
                        sum += 1.5 * credit;
                        cnt += credit;
                    } else if (dataArr[2].equals("D0")) {
                        sum += 1.0 * credit;
                        cnt += credit;
                    } else if (dataArr[2].equals("F")) {
                        cnt += credit;
                    }
                }
                gradeData = bufferedReader.readLine();
            }
        } catch (NumberFormatException e) {
            System.out.println("입력 형식이 잘못되었습니다.");
        } finally {
            bufferedReader.close();
        }

        if (cnt != 0) {
            System.out.println(sum / cnt);
        } else {
            System.out.println("평점 데이터가 없습니다.");
        }
    }
}
