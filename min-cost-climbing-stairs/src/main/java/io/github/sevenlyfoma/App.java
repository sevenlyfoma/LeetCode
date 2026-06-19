package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length+1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i < dp.length; i++){
            int v1 = dp[i-2] + cost[i-2];
            int v2 = dp[i-1] + cost[i-1];

            if (v1>v2){
                dp[i] = v2;
            }
            else{
                dp[i] = v1;
            }

        }
        

        return dp[cost.length];
    }
}
