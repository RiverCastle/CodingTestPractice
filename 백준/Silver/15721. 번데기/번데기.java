import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int people = Integer.parseInt(bufferedReader.readLine());
        int ordinal = Integer.parseInt(bufferedReader.readLine());
        int target = Integer.parseInt(bufferedReader.readLine());

        List<Integer> game = new ArrayList<>();
        int cnt = 0;
        int games = 1;
        while (ordinal > cnt) {
            game.add(0);
            game.add(1);
            game.add(0);
            game.add(1);
            for (int i = 0; i < games + 1; i++) {
                game.add(0);
            }
            for (int i = 0; i < games + 1; i++) {
                game.add(1);
            }
            games++;
            cnt += 2 + games;
        }

        int answerPerson = 0;
        for (int i = game.size() - 1; i > 0; i--) {
            if (game.get(i) == target) {
                if (cnt == ordinal) {
                    answerPerson = i;
                    break;
                } else {
                    cnt--;
                }
            }
        }
        System.out.println(answerPerson % people);
    }
}
