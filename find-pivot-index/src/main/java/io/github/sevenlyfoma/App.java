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
    public static int pivotIndex(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i ++){
            sum += nums[i];
        }

        int halfSum = 0;
        for (int i = 0; i < nums.length; i ++){
            int target = sum - nums[i];
            if (target % 2 == 0 && halfSum == (target/2)){
                return i;
            }
            halfSum += nums[i];
        }



        return -1;
    }

    public static int pivotIndexNonNegative(int[] nums) {
        
        int lp = 0;
        int ls = 0;
        int rp = nums.length-1;
        int rs = 0;

        while (lp != rp){
            if (rs <= ls){
                rs += nums[rp];
                rp--;
            }
            else{
                ls += nums[lp];
                lp++;
            }
        }

        if (ls == rs){
            return lp;
        }


        return -1;
    }
}
