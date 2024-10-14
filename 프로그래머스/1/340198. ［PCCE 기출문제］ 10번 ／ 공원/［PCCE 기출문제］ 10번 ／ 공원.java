class Solution {
    public int solution(int[] mats, String[][] park) {
        int largestSpace = findLargestSpaceInThePark(park);
        // 돗자리 선정
        boolean found = false;
        int answer = -1;
        for (int mat : mats) {
            if (largestSpace >= mat) {
                answer = Math.max(answer, mat);
            }
        }
        return answer;
    }

    private int findLargestSpaceInThePark(String[][] park) {
        int answer = 0;
        for (int y = 0; y < park.length; y++) {
            String[] low = park[y];
            for (int x = 0; x < park[0].length; x++) {
                if (low[x].equals("-1")) {
                    int tempAnswer = findLargestSpaceFromHere(x, y, park);
                    if (tempAnswer > answer) answer = tempAnswer;
                }
            }
        }
        return answer;
    }

    private int findLargestSpaceFromHere(int x, int y, String[][] park) {
        int tempAnswer = 1;
        boolean finish = false;
        while (!finish) {
            if (x + tempAnswer < park[0].length & y + tempAnswer < park.length) {
                for (int i = y; i <= y + tempAnswer; i++) {
                    for (int j = x; j <= x + tempAnswer; j++) {
                        if (!park[i][j].equals("-1")) return tempAnswer;
                    }
                }
                tempAnswer += 1;
            } else {
                finish = true;
            }
        }
        return tempAnswer;
    }
}