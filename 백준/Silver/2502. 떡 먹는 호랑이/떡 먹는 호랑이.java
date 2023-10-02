
import java.io.*;
import java.util.StringTokenizer;

public class Main {// 떡 먹는 호랑이 https://www.acmicpc.net/problem/2502

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numberD = Integer.parseInt(stringTokenizer.nextToken());
        int numberK = Integer.parseInt(stringTokenizer.nextToken());
        bufferedReader.close();

        if (numberD == 3) {
            bufferedWriter.write(1 + "\n");
            bufferedWriter.write(numberK - 1 + "\n");
            bufferedWriter.flush();
            bufferedReader.close();
            bufferedWriter.close();

        } else {
            // 계수
            int aNumber = 1; // 1일차
            int bNumber = 1; // 2일차
            // 3일차 = 1 : 1
            for (int i = 4; i <= numberD; i++) {
                int tmp = bNumber;
                bNumber = aNumber + bNumber;
                aNumber = tmp;
            }

            int size = numberK / bNumber;    //y 입력 가능한 최대값
            //x가 자연수가 되는 y의 최대값 탐색!
            for (int i = size - 1; i >= 0; i--) {
                if ((numberK - (i * bNumber)) % aNumber == 0) {    //x가 자연수가 되는 y의 최대값 성립!
                    //x의 값과 y의 값 BufferedWriter 저장
                    bufferedWriter.write((numberK - (i * bNumber)) / aNumber + "\n" + i);
                    break;
                }
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        }


    }
}

