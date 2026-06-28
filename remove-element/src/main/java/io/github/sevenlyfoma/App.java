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

        int[] nums = {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(nums, 2) );
    }

    public static int removeElement(int[] nums, int val) {
        int numRemoved = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                numRemoved++;
            }

            else if (numRemoved != 0){
                nums[i-numRemoved] = nums[i];
            }

            System.err.println("" + Arrays.toString(nums));
        }
        return nums.length - numRemoved;
    }
}
