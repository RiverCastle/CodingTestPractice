class Solution {
    public int solution(String my_string, String target) {
        target = "(.*)" + target + "(.*)";
        if(my_string.matches(target)) {
            return 1;
        } else {
            return 0;
        }
    }
}