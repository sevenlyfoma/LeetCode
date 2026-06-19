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
    
    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        if (n==1){
            return nums[0];
        }

        if (n >= 1){
            dp[0] = nums[0];
        }
        if (n >= 2){
            dp[1] = nums[1];
        }
        if (n >= 3){
            dp[2] = nums[0] + nums[2];
        }

        for (int i = 3; i < n; i++){
            int twoBack = dp[i-2] + nums[i];
            int threeBack = dp[i-3] + nums[i];

            if (threeBack >= twoBack){
                dp[i] = threeBack;
            }
            else{
                dp[i] = twoBack;
            }
        }

        int max = dp[n-1];
        if (dp[n-2] > max){
            max = dp[n-2];
        }

        return max;
    }

}
