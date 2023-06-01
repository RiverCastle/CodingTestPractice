import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int cardsPieces = Integer.parseInt(bufferedReader.readLine()); //상근이 카드 수
        StringTokenizer stringTokenizer;

        String cardsLine = bufferedReader.readLine(); //상근이 카드

        int cardsSet = Integer.parseInt(bufferedReader.readLine()); //카드 덱 수
        String cardsDeck = bufferedReader.readLine(); //카드 덱
        stringTokenizer = new StringTokenizer(cardsDeck); //토크나이저 카드덱

        HashMap<Integer, Integer> hashMap = new HashMap<>(cardsSet);

        for (int i = 0; i < cardsSet; i++) { //해쉬 카드 덱
            int cardNum = Integer.parseInt(stringTokenizer.nextToken()); //토크나이저 카드덱
            hashMap.put(cardNum, 0);
        }

        stringTokenizer = new StringTokenizer(cardsLine); //토크나이저 상근
        for (int i = 0; i < cardsPieces; i++) {
            int cardSK = Integer.parseInt(stringTokenizer.nextToken()); //토크나이저 상근
            if (hashMap.containsKey(cardSK)) {
                hashMap.put(cardSK, hashMap.get(cardSK) + 1);
            }
        }
        bufferedReader.close();

        stringTokenizer = new StringTokenizer(cardsDeck); //토크나이저 카드덱


        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < cardsSet; i++) { //해쉬 카드 덱
            int cardNum = Integer.parseInt(stringTokenizer.nextToken()); //토크나이저 카드덱
            if (hashMap.containsKey(cardNum)) {
                bufferedWriter.write(hashMap.get(cardNum) + " ");
            }
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
