package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] nums = {-1};
        System.out.println(findMaxAverage(nums, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int maxTotal = Integer.MIN_VALUE;
        
        int runningTotal = 0;

        for (int i = 0; i < nums.length; i++){
            runningTotal += nums[i];
            if (i >= k){
                runningTotal -= nums[i-k];
            }

            if (i >= k-1){
                if (runningTotal > maxTotal){
                    maxTotal = runningTotal;
                }
            }
        }

        return (double) maxTotal / (double) k;
    }
}
