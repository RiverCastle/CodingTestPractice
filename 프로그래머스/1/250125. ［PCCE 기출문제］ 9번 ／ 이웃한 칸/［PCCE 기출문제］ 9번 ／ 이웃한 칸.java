class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String targetColor = board[h][w];
        if (w > 0 && board[h][w-1].equals(targetColor)) answer += 1; // left
        if (w < board[0].length - 1 && board[h][w+1].equals(targetColor)) answer += 1; // right
        if (h > 0 && board[h-1][w].equals(targetColor)) answer += 1; // top
        if (h < board.length - 1 && board[h+1][w].equals(targetColor)) answer += 1; // bottom
        return answer;
    }
}