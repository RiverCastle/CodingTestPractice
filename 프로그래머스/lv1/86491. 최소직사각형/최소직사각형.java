class Solution {
    public int solution(int[][] sizes) {
        int maxWith = 0;
        int maxHeight = 0;
        for (int i = 0 ; i< sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];
            if (width < height) {
                sizes[i][0] = height;
                sizes[i][1] = width;
            }
            if (sizes[i][0] > maxWith) maxWith = sizes[i][0];
            if (sizes[i][1] > maxHeight) maxHeight = sizes[i][1];
        }
        
        return maxWith * maxHeight;
    }
}