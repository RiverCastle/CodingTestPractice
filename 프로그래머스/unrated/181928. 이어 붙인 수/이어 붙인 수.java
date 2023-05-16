import static java.lang.Math.pow;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int evenpos = 0;
        int oddpos = 0;

        for (int i = num_list.length - 1; i >= 0; i--) {
            int rest = num_list[i] % 2;
            switch (rest) {
                case 0 :
                    answer += num_list[i] * pow(10, evenpos);
                    evenpos += 1;
                    break;
                    
                case 1 :
                    answer += num_list[i] * pow(10, oddpos);
                    oddpos += 1;
                    break;
            }
        }
        return answer;
    }
}