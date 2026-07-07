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

    public static boolean canJump(int[] nums) {
        if (nums.length <= 1){
            return true;
        }


        boolean canReachEnd = true;

        int i = 1;

        int prev = nums[0];

        while (i < nums.length && canReachEnd == true){
            if (prev == 0){
                canReachEnd = false;
            }

            prev = Math.max(nums[i], prev-1);

            i++;
        }

        return canReachEnd;
    }
}
