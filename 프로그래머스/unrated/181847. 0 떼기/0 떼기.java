class Solution {
    public String solution(String n_str) {
        while (n_str.startsWith("0")) {
            n_str = n_str.replaceFirst("0", "");
            System.out.println(n_str);
        }
        return n_str;
    }
}