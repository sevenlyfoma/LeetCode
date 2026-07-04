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
        // int[] input = {1,2,3,4,5,6,7,8,9,10,11,12};
        // int k = 7 ;

        int[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
        int k = 38;

        App.rotate(input, k);

        System.out.println("" + Arrays.toString(input));
    }

    public static void rotate(int[] nums, int k) {
        rotateSegment(nums, k, 0, nums.length-1);
    }

    public static void rotateSegment(int[] nums, int k, int start, int finish) {

        if (start >= finish){
            return;
        }

        int length = finish-start+1;

        int rotAmount = k % length;

        if (rotAmount == 0){
            return;
        }

        int count = 0;

        int remainder = (length % rotAmount);

        int wholeNumberRotsN = length - remainder ;


        int i;
        for (i = 0; i < wholeNumberRotsN; i++){
            if (count >= rotAmount){
                count = 0;
            }

            int rotationTarget = start+ ((i + rotAmount) % length);
            int replaced = nums[rotationTarget];

            int x = nums[start+count];

            nums[rotationTarget] =x;
            nums[start + count] = replaced;

            count++;

        }

        int newRotate = rotAmount - remainder;
        if (rotAmount - remainder != 0){
            rotateSegment(nums, newRotate , start+rotAmount-remainder, start+rotAmount-1);
        }

    }

}
