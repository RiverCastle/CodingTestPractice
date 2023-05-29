import java.math.BigInteger;

public class Solution {
    public String solution(String a, String b) {
        BigInteger bigInteger1 = new BigInteger(a);
        BigInteger bigInteger2 = new BigInteger(b);
        return bigInteger1.add(bigInteger2).toString();

    }
}