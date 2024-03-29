class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int length = number.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    int student1 = number[i];
                    int student2 = number[j];
                    int student3 = number[k];
                    if (sum(student1, student2, student3) == 0) answer++;
                }
            }
        }
        return answer;
    }

    private int sum(int student1, int student2, int student3) {
        return student1 + student2 + student3;
    }
}