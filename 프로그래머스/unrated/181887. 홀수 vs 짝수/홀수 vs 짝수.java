class Solution {
    public int solution(int[] num_list) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < num_list.length; i = i + 2) {
            sumEven += num_list[i];
        }
        for (int i = 1; i < num_list.length; i = i + 2) {
            sumOdd += num_list[i];
        }
        
        return sumEven > sumOdd ? sumEven : sumOdd;
    }
}