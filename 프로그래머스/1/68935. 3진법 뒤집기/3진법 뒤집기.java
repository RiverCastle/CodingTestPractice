class Solution {
    public int solution(int n) {
        String temp = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder();
        for (int i = temp.length() - 1; i >= 0; i--)
            sb.append(temp.charAt(i));

        int answer = Integer.parseInt(sb.toString(), 3);
        return answer;
    }
}