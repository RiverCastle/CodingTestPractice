import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int length = nums.length;
        Set types = new HashSet();
        for (int i : nums)
            if (!types.contains(i)) types.add(i);

        int typeCount = types.size();
        int lengthHalf = length / 2;
        int answer = typeCount > lengthHalf ? lengthHalf : types.size();
        return answer;
    }
}