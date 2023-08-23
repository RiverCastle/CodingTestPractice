import java.io.*;
import java.util.*;

public class Main {// 쉬운 계단수
    static long [][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new long[n+1][10];

        for(int i=0; i<=9; i++){
            dp[1][i]=1l;
        }
        long result=0;

        for(int i=1; i<=9; i++){
            result+=solve(n, i);
        }

        System.out.println((result)%1000000000);
    }

    private static long solve(int index, int num){
        if(index==1){
            return dp[index][num];
        }

        if(dp[index][num]==0){
            if(num==0){
                dp[index][num] = solve(index-1, 1);
            }
            else if(num==9){
                dp[index][num] = solve(index-1, 8);
            }
            else{
                dp[index][num] = solve(index-1,num+1)+solve(index-1, num-1);
            }
        }

        return dp[index][num]%1000000000;
    }
}