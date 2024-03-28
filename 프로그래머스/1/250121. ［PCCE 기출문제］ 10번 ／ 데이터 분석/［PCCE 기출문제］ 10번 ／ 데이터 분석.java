import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();
        int idx;
        if (ext.equals("code")) idx = 0;
        else if (ext.equals("date")) idx = 1;
        else if (ext.equals("maximum")) idx = 2;
        else idx = 3;

        int sortIdx;
        if (sort_by.equals("code")) sortIdx = 0;
        else if (sort_by.equals("date")) sortIdx = 1;
        else if (sort_by.equals("maximum")) sortIdx = 2;
        else sortIdx = 3;

        for (int[] piece : data)
            if (piece[idx] < val_ext) answer.add(piece);

        Collections.sort(answer, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[sortIdx] > o2[sortIdx])
                    return 1;
                else if (o1[sortIdx] < o2[sortIdx]) {
                    return -1;
                }
                return 0;
            }
        });

        return answer;
    }
}