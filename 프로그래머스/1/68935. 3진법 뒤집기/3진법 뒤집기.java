class Solution {
    public int solution(int n) {
        String temp = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(temp).reverse();
        int answer = Integer.parseInt(sb.toString(), 3);
        return answer;
    }
}