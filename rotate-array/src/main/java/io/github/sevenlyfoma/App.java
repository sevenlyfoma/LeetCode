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
        int[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54};
        int k = 45;

        App.rotate(input, k);
    }

    public static void rotate(int[] nums, int k) {

        int rotAmount = k % nums.length;

        int lookForOffSet = 0;

        int looksforChange = rotAmount;

        int lastRotationExit= -1;
        
        for (int i = 0; i < nums.length-1; i++){

            int rotationTarget = (i + rotAmount) % nums.length;
            int replaced = nums[rotationTarget];

            if (i >= looksforChange){
                looksforChange = (i + rotAmount);
                lookForOffSet += 1 + (lastRotationExit % rotAmount);
                System.out.println(lastRotationExit);
                System.out.println(lookForOffSet);
            }

            int xPos = (i - lookForOffSet) % nums.length;
            int x = nums[xPos];

            nums[xPos] = replaced;
            nums[rotationTarget] = x;

            
            lastRotationExit = rotationTarget;

            System.out.println("" + Arrays.toString(nums));
        }
    }

    public static void rotateOld(int[] nums, int k) {
        int alreadyRotatedPos = nums.length+1;

        int rotAmount = k % nums.length;

        int count = 0;

        int modifer = 0;

        for (int i = 0; i < nums.length; i++){

            int rotationTarget = (i + rotAmount) % nums.length;
            int replaced = nums[rotationTarget];

            if (i >= alreadyRotatedPos){
                modifer += count;
                count = 0;
                System.out.println(modifer);
            }

            if (count == 0){
                alreadyRotatedPos = (i + rotAmount);
                // System.out.println(alreadyRotatedPos);
            }
            int x = nums[i - modifer];

            nums[rotationTarget] =x;
            nums[i - modifer] = replaced;
            count++;

            // if (i < alreadyRotatedPos){
            //     int x = nums[i - modifer];

            //     nums[rotationTarget] =x;
            //     nums[i] = replaced;
            //     count++;
            // }

            // else{
            //     modifer = count;
            //     count = 0;

            // }

            

            // if (i >= rotationTa5rget)

            

            

            System.out.println("" + Arrays.toString(nums));

            

        }


    }
}
