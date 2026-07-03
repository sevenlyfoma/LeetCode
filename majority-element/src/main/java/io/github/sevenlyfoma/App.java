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
        System.out.println( "Hello World!" );
    }

    //https://www.geeksforgeeks.org/theory-of-computation/boyer-moore-majority-voting-algorithm/
    //USes this voting algorithm. Cool!
    public static int majorityElement(int[] nums) {
        

        int count = 0;

        int candidate = -1;

        for (int i = 0; i < nums.length; i++){
            int n = nums[i];

            if (count == 0){
                candidate = n;
            }

            if (n == candidate){
                count++;
            }
            else{
                count--;
            }

        }

        return candidate;
    }

    public static int majorityElementSlow(int[] nums) {
        

        Arrays.sort(nums);

        int target = Math.ceilDiv(nums.length, 2);

        int current  = 1;

        int last = nums[0];

        for (int i = 1; i < nums.length; i++){
            int n = nums[i];
            if (n == last){
                current++;
                if (current >= target){
                    return last;
                }
            }
            else{
                current = 1;
                last = n;
            }
        }

        return last;
    }
}
