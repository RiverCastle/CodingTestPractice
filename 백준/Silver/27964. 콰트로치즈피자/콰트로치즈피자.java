import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int ingredients = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer ingredientsToken = new StringTokenizer(bufferedReader.readLine());
        List<String> cheeses = new ArrayList<>();
        for (int i = 0; i < ingredients; i++) {
            String ingredient = ingredientsToken.nextToken();
            if (ingredient.endsWith("Cheese") && !cheeses.contains(ingredient)) cheeses.add(ingredient);
            if (cheeses.size() == 4) break;
        }
        if (cheeses.size() == 4) System.out.println("yummy");
        else System.out.println("sad");
    }
}
