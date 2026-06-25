package io.github.sevenlyfoma;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App.climbStairs(4);
    }

    public static int climbStairs(int n) {
        if (n == 1){
            return 1;
        }

        int[] dp = new int[n];

        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i< n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }

        System.out.println(Arrays.toString(dp));


        return dp[n-1];
    }
}
