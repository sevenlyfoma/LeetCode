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
        // int[] input = {2,3,1,1,4};

        int[] input = {2,1};

        System.out.println(jump(input));
    }

    public static int jump(int[] nums) {

        int minJumps = 0;
        int maxJumpDist = Math.min(nums.length-1, nums[0]);

        int newMaxJumpDist = -1;

        for (int i = 1; i < nums.length; i++){

            int jumpDist = i + nums[i];

            if (jumpDist > newMaxJumpDist){
                newMaxJumpDist = jumpDist;
            }

            if (i == maxJumpDist){
                minJumps += 1;
                
                maxJumpDist = Math.min(nums.length-1, newMaxJumpDist);
                newMaxJumpDist = -1;
            }

            

        }


        return minJumps;
    }
    public static int jumpdp(int[] nums) {

        int[] dp = new int[nums.length];

        for (int i = 1; i < dp.length; i++){
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < nums.length; i++){

            int x = nums[i];
            
            int range = Math.min(nums.length-i-1, x);

            int jumps = dp[i] + 1;

            for (int j = i+1; j <= i+range; j++){
                dp[j] = Math.min(jumps, dp[j]);
            }

            System.out.println(Arrays.toString(dp));
        }


        return dp[nums.length-1];
    }
}
