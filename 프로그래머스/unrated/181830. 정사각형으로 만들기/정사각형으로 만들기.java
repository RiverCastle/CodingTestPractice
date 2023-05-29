class Solution {
    public int[][] solution(int[][] arr) {
        int height = arr.length;
        int width = arr[0].length;
        int difference = height - width;
        
        if (difference > 0) {
            int[][] answer = new int[height][height];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else if(difference < 0) {
            int[][] answer = new int[width][width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else {
            return arr;
        }
    }
}