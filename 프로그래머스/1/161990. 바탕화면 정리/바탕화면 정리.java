class Solution {
    public int[] solution(String[] wallpapers) {
        int xMin = wallpapers[0].length();
        int xMax = 0;
        int yMin = wallpapers.length;
        int yMax = 0;
        int xLength = wallpapers[0].length();
        int yLength = wallpapers.length;

        for (int i = 0; i < yLength; i++) {
            String wallPaper = wallpapers[i];
            for (int j = 0; j < xLength; j++) {
                if (wallPaper.charAt(j) == '#') {
                    if (xMin > j) xMin = j;
                    if (xMax < j) xMax = j;
                    if (yMin > i) yMin = i;
                    if (yMax < i) yMax = i;
                }
            }
        }

        int[] answer = {yMin, xMin, yMax + 1, xMax + 1};
        return answer;
    }
}