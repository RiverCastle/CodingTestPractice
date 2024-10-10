import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        int arrLength = 'z' - 'a' + 1;
        List<String> alphabets = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            if (checkSkip(skip, (char) i)) alphabets.add(Character.toString(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String alphabet = String.valueOf(s.charAt(i));
            int location = alphabets.indexOf(alphabet) + index;
            location = location >= alphabets.size() ? location % alphabets.size() : location;
            sb.append(alphabets.get(location));
        }
        return sb.toString();
    }

    private boolean checkSkip(String skip, char a) {
        String alphabet = Character.toString(a);
        if (skip.contains(alphabet)) return false;
        else return true;
    }
}